package lv.rvt;

import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers: ");
        int summa = 0;
        int skaitlis = 0;
        int sksk = 0;
        int even = 0;
        int odd = 0;

        while (true) { 
            skaitlis = Integer.valueOf(scanner.nextLine());
            if (skaitlis != -1) {
                summa = summa + skaitlis;
                sksk = sksk +1;
                if (skaitlis%2 == 0) {
                    even = even + 1;
                } else {
                    odd = odd + 1;
                }
            } else {
                break;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + summa);
        System.out.println("Numbers: " + sksk);
        double average = (double)summa/sksk;
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        

    }
    

}