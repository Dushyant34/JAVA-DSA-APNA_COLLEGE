import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        
        /* //Basic code
        int counter = 0;
        
        while (counter < 20) {
            System.out.println("Hello World");
            counter ++;
        }

        System.out.println("Printed HW 20x"); */

        //1 to n
        int counter = 1;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Range: ");
        int range = sc.nextInt();

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }

        sc.close();
    }
}
