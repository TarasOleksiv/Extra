package Module2_1;

import java.util.Scanner;

/**
 * Created by Taras on 30.06.2017.
 */
public class Main {
    public static void main(String[] args){

        System.out.println("Введіть декілька чисел через кому: ");
        Scanner sc = new Scanner(System.in);
        String delims = "[,]+";
        String[] line = sc.nextLine().split(delims);
        int[] a = new int[line.length];

        for (int i = 0; i < line.length ; i++){
            a[i] = Integer.parseInt(line[i]);
        }

        int max = a[0];

        for (int i = 0; i < a.length; i++){
            if (max < a[i]){
                max = a[i];
            }
        }

        System.out.println("Максимальне число: " + max);
    }
}
