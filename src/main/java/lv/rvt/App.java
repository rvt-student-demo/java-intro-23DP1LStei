package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        int number1 = Integer.valueOf(scanner.nextLine());

        
        System.out.println("Second number: ");
        int number2 = Integer.valueOf(scanner.nextLine());

        if (number1 > number2) {
            System.out.println("The greatest number is: " + number1);
        } else if (number1 < number2) {
            System.out.println("The greatest number is: " + number2);
        } else { 
            System.out.println("Two numbers are equal.");
        } 
    }

}