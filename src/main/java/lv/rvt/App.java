package lv.rvt;

public class App {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.println("***");
        }
    }


    public static void printRectangle(int width, int height) {
        System.out.println("");
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        System.out.println("");
        for (int i = 0; i < size; i++) {
            printStars(i+1);
        }
        
    }
    

    public static void printSpaces(int number){
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
        

    }

    public static void printTriangle2(int size) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            printSpaces(size-i-1);
            printStars(i+1);
        }
    }



    public static void christmasTree(int height) {
        System.out.println();
        for (int i = 0; i < height; i++) {
            printSpaces(height-i-1);
            printStars(1+i*2);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height-2);
            printStars(3);
            
        }
    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        
        printSquare(5);

        printRectangle(10, 4);

        printTriangle(5);

        printTriangle2(5);


        christmasTree(10);
    }
}