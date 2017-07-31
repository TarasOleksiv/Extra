package Module5;

import Module5.vehicles.Car;
import Module5.vehicles.CarDoor;
import Module5.vehicles.CarWheel;

import java.util.Scanner;

/**
 * Created by t.oleksiv on 31/07/2017.
 */

public class CarTask {
    private Scanner sc;
    private Car car;

    public CarTask(Car car){
        this.car = car;
        sc = new Scanner(System.in);
        chooseCarTask();
    }

    private void chooseCarTask(){
        System.out.println();
        System.out.println("Меню \"Машина\".");
        System.out.println("Яке завдання виконуєм? (1 - Змінити поточну швидкість, 2 - Посадити 1 пасажира, 3 - Висадити 1 пасажира, 4 - Висадити всіх пасажирів, ");
        System.out.println("                        5 - Отримати двері по індексу, 6 - Отримати колесо по індексу, 7 - Зняти всі колеса з машини, 8 - Встановити на машину нові колеса, ");
        System.out.println("                        9 - Обчислити поточну можливу максимальну швидкість, 10 - Вивести інформацію про об'єкт, інший символ - Вихід в головне меню.)");
        System.out.print("Введіть символ: ");
        String n = sc.nextLine().trim();
        switch (n) {
            case "1":
                System.out.print("Яку поточну швидкість встановити? Введіть ціле число: ");
                int x = sc.nextInt();
                sc.nextLine();
                car.setCurrentSpeed(x);
                System.out.println("Поточна швидкість: " + car.getCurrentSpeed());
                break;
            case "2":
                car.takeOnePassenger();
                System.out.println("Поточна кількість пасажирів у машині: " + car.getCurrentNumberOfPassengers());
                break;
            case "3":
                car.getoffOnePassenger();
                System.out.println("Поточна кількість пасажирів у машині: " + car.getCurrentNumberOfPassengers());
                break;
            case "4":
                car.getoffAllPassengers();
                System.out.println("Поточна кількість пасажирів у машині: " + car.getCurrentNumberOfPassengers());
                break;
            case "5":
                System.out.print("Які двері отримати? введіть індекс: ");
                int i = sc.nextInt();
                sc.nextLine();
                CarDoor cd = car.getCarDoor(i);
                if (cd != null){
                    System.out.println("Отримали двері по індексу " + i + " : " + car.getCarDoor(i));
                    cd.showInfo();
                }
                break;
            case "6":
                System.out.print("Яке колесо отримати? введіть індекс: ");
                int j = sc.nextInt();
                sc.nextLine();
                CarWheel cw = car.getCarWheel(j);
                if (cw != null) {
                    System.out.println("Отримали колесо по індексу " + j + " : " + cw);
                    cw.showInfo();
                }
                break;
            case "7":
                car.getOffAllCarWheels();
                System.out.println("Всі колеса зняті.");
                System.out.println("Поточна кількість коліс на машині: " + car.getCurrentNumberOfWheels());
                break;
            case "8":
                System.out.print("Скільки коліс ви хотіли б встановити? введіть ціле число: ");
                int k = sc.nextInt();
                sc.nextLine();
                System.out.println("Кількість коліс до встановлення нових: " + car.getCurrentNumberOfWheels());
                car.setNewWheels(k);
                System.out.println("Поточна кількість коліс на машині: " + car.getCurrentNumberOfWheels());
                break;
            case "9":
                System.out.println("поточна можлива максимальна швидкість: " + car.getCurrentMaxSpeed(car.getMinTireWheel()));
                break;
            case "10":
                car.showInfo();
                break;
            default:
                return;
        }
        chooseCarTask();
    }
}
