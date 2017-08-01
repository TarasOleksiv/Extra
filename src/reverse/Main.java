package reverse;

import java.util.Scanner;

/**
 * Created by Taras on 31.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть слова: ");
        Scanner sc = new Scanner(System.in);
        String delims = "[ ]+";
        String[] words = sc.nextLine().split(delims);
        System.out.println("Зворотня фраза:");
        for (int i = 0; i < words.length; i++){
            Word word = new Word(words[i]);
            System.out.print(" ");
        }
    }
}
