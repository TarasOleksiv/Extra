package Module2_2;

import java.util.Scanner;

/**
 * Created by Taras on 30.06.2017.
 */
public class Main {
    public static void main(String[] args){
        int floors = 9; //кількість поверхів
        int p_count = 4; //кількість під'їздів
        int f_flat = 4; //кількість квартир на поверсі
        int p_flat = floors * f_flat; //кількість квартир в під'їзді

        System.out.print("Введіть номер квартири: ");
        Scanner sc = new Scanner(System.in);
        int fl = sc.nextInt();
        int fl_count = floors * p_count * f_flat;

        if ((fl > fl_count) || (fl <= 0)){
            System.out.println("Квартири з таким номером не існує.");
        } else {
            int fl_p = (int)Math.ceil((double)fl / p_flat); // № під'їзду
            int rest = fl % p_flat == 0 ? p_flat : fl % p_flat;
            int fl_floor = (int)Math.ceil((double)rest/f_flat); // поверх
            System.out.println("Квартира №" + fl + " знаходиться на поверсі №" + fl_floor + " під'їзду №" + fl_p);        }
    }
}
