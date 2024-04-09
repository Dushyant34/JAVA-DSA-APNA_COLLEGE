import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Code 1
        //System.out.println("Enter the Age:");
        // int age = sc.nextInt();

        // if(age >= 18){
        //     System.out.println("You can drink and drive");
        // }

        // if(age > 13 && age < 18){
        //     System.out.println("Teenager");
        // }
        
        // else{
        //     System.out.println("Kimds");
        // }

        
        //Code 2
        // int a = 1;
        // int b = 5;

        // if(a >= b){
        //     System.out.println("The greater is: " + a);
        // }
        // else{
        //     System.out.println("The greater is: " + b);
        // }

        
        //Code 3
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Even");
        }

        else{
            System.out.println("Odd");
        } 

        sc.close();
    }
}
