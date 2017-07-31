package Module5;

import Module5.vehicles.Car;
import Module5.vehicles.CarDoor;
import Module5.vehicles.CarWheel;

import java.util.Scanner;

/**
 * Created by t.oleksiv on 19/07/2017.
 */
public class Main {
    private Scanner sc = new Scanner(System.in);
    private Car car;

    public Main(){
        car = new Car(2017,"External",180,10,5,1,0);
        chooseMainTask();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }

    public void chooseMainTask(){
        System.out.println();
        System.out.println("Головне меню.");
        System.out.println("З яким об'єктом працюєм? (1 - Машина, 2 - Двері, 3 - Колеса, інший символ - Вихід з програми)");
        System.out.print("Введіть символ: ");
        String n = sc.nextLine().trim();
        switch (n) {
            case "1":
                CarTask carTask = new CarTask(car);
                break;
            case "2":
                System.out.print("З якими дверима працюємо? Введіть індекс: ");
                int i = sc.nextInt();
                sc.nextLine();
                CarDoor carDoor = car.getCarDoor(i);
                CarDoorTask carDoorTask = new CarDoorTask(carDoor);
                break;
            case "3":
                System.out.print("З яким колесом працюємо? Введіть індекс: ");
                int j = sc.nextInt();
                sc.nextLine();
                CarWheel carWheel = car.getCarWheel(j);
                CarWheelTask carWheelTask = new CarWheelTask(carWheel);
                break;
            default:
                System.out.println("Ви закінчили виконання програми.");
                return;
        }
        chooseMainTask();
    }
}
