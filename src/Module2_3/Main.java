package Module2_3;

import java.util.Scanner;

/**
 * Created by Taras on 30.06.2017.
 * Програмі відомі 2 типи послідовностей: арифметична та геометрична прогресії.
 * Програма просить ввести мінімум 3 числа.
 * Програма аналізує перші 3 введені числа і
 * перевіряє чи утворюють вони хоча б одну з двох прогресій (арифметичну чи геометричну).
 * При першому співпадінні виводиться наступне число послідовності.
 * Якщо ж відповідного алгоритму не знайдено, виводиться відповідне повідомлення.
 */

public class Main {
    public static void main(String[] args){
        System.out.print("Введіть декілька (мінімум 3) чисел через кому: ");
        Scanner sc = new Scanner(System.in);
        String delims = "[,]+";
        String[] line = sc.nextLine().split(delims);
        int[] a = new int[line.length];

        if (line.length < 3) {
            System.out.println("Введених чисел замало, щоб визначити тип послідовності.");
            System.out.println("Запустіть програму ще раз та введіть хоча б 3 числа.");
        } else {
            for (int i = 0; i < line.length ; i++){
                a[i] = Integer.parseInt(line[i]);
            }

            // перевірка чи введені числа становлять арифметичну прогресію
            if (a[2] - a[1] == a[1] - a[0]){
                System.out.println("Арифметична прогресія. Наступне число " + ariphmetic(a[0], a.length, a[1] - a[0]));
                // перевірка чи введені числа становлять геометричну прогресію
            } else if ((a[0] != 0) && ((double)a[2] / a[1] == (double)a[1] / a[0]) && (a[1] % a[0] == 0)) {
                System.out.println("Геометрична прогресія. Наступне число " + geometric(a[0], a.length, a[1] / a[0]));
            } else {
                System.out.println("Дана послідовність не є ні арифметичною, ні геометричною прогресією.");
                System.out.println("Неможливо визначити тип послідовності.");
            }
        }
    }

    public static int ariphmetic(int a, int n, int d){
        return a + d*n;
    }

    public static int geometric(int b, int n, int q){
        return b * (int)Math.pow(q,n);
    }

}
