package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First points: ");
        int points = Integer.valueOf(scanner.nextLine());
        if (points<0) {
            System.out.println("Impossible!");
        } else if (points<50) {
            System.out.println("failed");
        } else if (points<60) {
            System.out.println("1");
        } else if (points<70) {
            System.out.println("2");
        } else if (points<80) {
            System.out.println("3");
        } else if (points<90) {
            System.out.println("4");
        } else if (points<101) {
            System.out.println("incredible!");
        } else {

        }
    }

}