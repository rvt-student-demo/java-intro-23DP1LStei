package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?: ");
        String name = scanner.nextLine();


        System.out.println("What's your last name?: ");
        String lastname = scanner.nextLine();

        System.out.println("What's your group?: ");
        String group = scanner.nextLine();


        System.out.println("Student: " + name + " " + lastname + ", group: " + group);
    }

}