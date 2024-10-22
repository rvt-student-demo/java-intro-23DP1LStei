package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        

        while (true) { 
            numbers.add(Integer.valueOf(scanner.nextLine()));

            if (numbers.get(numbers.size()-1) == -1) {
                break;
            }
                
            
            
        }
        System.out.println(numbers);
        
        int from_where = 0;
        while (true) { 
            System.out.print("From where? ");
            from_where = Integer.valueOf(scanner.nextLine());
            if (from_where>=0 && from_where<numbers.size()) {
                break;
            } else {
                System.out.println("Enter the valid index. ");
            }
        }


        int to_where = 0;
        while (true) { 
            System.out.print("To where? ");
            to_where = Integer.valueOf(scanner.nextLine());
            if (to_where>=0 && to_where<numbers.size()) {
                break;
            } else {
                System.out.println("Enter the valid index. ");
            }
        }
        
        for (int i = from_where; i <= to_where; i++) {
            System.out.println(numbers.get(i));
            
        }

        
    }
}