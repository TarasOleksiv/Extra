package Module5;

import Module5.vehicles.CarDoor;

import java.util.Scanner;

/**
 * Created by t.oleksiv on 31/07/2017.
 */

public class CarDoorTask {
    private Scanner sc;
    private CarDoor cardoor;

    public CarDoorTask(CarDoor cardoor){
        sc = new Scanner(System.in);
        this.cardoor = cardoor;
        chooseCarDoorTask();
    }

    private void chooseCarDoorTask(){

        System.out.println();
        System.out.println("Меню \"Двері\".");
        System.out.println("Яке завдання виконуєм? (1 - Відкрити двері, 2 - Закрити двері, 3 - Інверснути стан дверей, " +
                "4 - Відкрити вікно, 5 - Закрити вікно, 6 - Інверснути стан вікна, " +
                "7 - Вивести інформацію про об'єкт, інший символ - Вихід в головне меню.)");
        System.out.print("Введіть символ: ");
        String n = sc.nextLine().trim();
        switch (n) {
            case "1":
                cardoor.openDoor();
                System.out.println("Відкрили двері.");
                break;
            case "2":
                cardoor.closeDoor();
                System.out.println("Закрили двері.");
                break;
            case "3":
                System.out.println("Стан дверей перед проведенням операції: " + ((cardoor.getDoor())?"відкриті":"закриті"));
                cardoor.setDoor();
                System.out.println("Стан дверей після проведення операції: " + ((cardoor.getDoor())?"відкриті":"закриті"));
                break;
            case "4":
                cardoor.openWindow();
                System.out.println("Відкрили вікно.");
                break;
            case "5":
                cardoor.closeWindow();
                System.out.println("закрили вікно.");
                break;
            case "6":
                System.out.println("Стан вікна перед проведенням операції: " + ((cardoor.getWindow())?"відкриті":"закриті"));
                cardoor.setWindow();
                System.out.println("Стан вікна після проведення операції: " + ((cardoor.getWindow())?"відкриті":"закриті"));
                break;
            case "7":
                cardoor.showInfo();
                break;
            default:
                return;
        }
        chooseCarDoorTask();
    }

}
