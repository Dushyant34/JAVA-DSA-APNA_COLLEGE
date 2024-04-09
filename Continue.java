import java.util.*;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Code 1
        for(int i=1; i<=5; i++){
        if(i == 3){
        continue;
        }
        System.out.println(i);
        }

        //Continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

        // Code 2
        // do {
        //     System.out.println("Enter your number: ");
        //     int n = sc.nextInt();

        //     if (n % 10 == 0) {
        //         continue;
        //     }

        //     System.out.println("Number was: " + n);
        // } while (true);
        

    }
}
