import java.util.*;

public class Break {
    public static void main(String[] args) {
        
        //Code 1
        for (int i = 1; i < 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("I am out of the loop");

        //Break statement in Java terminates the loop immediately, and the control of the program moves to the next statement following the loop.
        
        //Code 2
        // Scanner sc = new Scanner(System.in);
        
        // do{
        //     int n = sc.nextInt();

        //     if(n % 10 == 0){
        //         break;
        //     }

        //     System.out.println(n);

        // } while(true);

        //sc.close();
    }
}
