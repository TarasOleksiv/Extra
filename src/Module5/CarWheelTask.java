package Module5;

import Module5.vehicles.CarWheel;

import java.util.Scanner;

/**
 * Created by t.oleksiv on 31/07/2017.
 */

public class CarWheelTask {
    private Scanner sc;
    private CarWheel carWheel;

    public CarWheelTask(CarWheel carWheel){
        sc = new Scanner(System.in);
        this.carWheel = carWheel;
        chooseCarWheelTask();
    }

    private void chooseCarWheelTask(){

        System.out.println();
        System.out.println("Меню \"Колеса\".");
        System.out.println("Яке завдання виконуєм? (1 - Поставити нову шину, 2 - Стерти шину на Х%, " +
                "3 - Вивести стан шини, 4 - Вивести інформацію про об'єкт, інший символ - Вихід в головне меню.)");
        System.out.print("Введіть символ: ");
        String n = sc.nextLine().trim();
        switch (n) {
            case "1":
                carWheel.setNewTire();
                System.out.println("Нову шину встановлено");
                break;
            case "2":
                System.out.print("На скільки відсотків стерти шину? Введіть число від 0 до 100: ");
                double x = sc.nextDouble();
                sc.nextLine();
                carWheel.abradeTire(x);
                System.out.println("Шину стерто на " + x + "%");
                carWheel.showInfo();
                break;
            case "3":
                System.out.println("Стан шини - " + carWheel.getTireState() + " від нової.");
                break;
            case "4":
                carWheel.showInfo();
                break;
            default:
                return;
        }
        chooseCarWheelTask();
    }

}
