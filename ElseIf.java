import java.util.*;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        // Code 1
        // System.out.println("Enter the Age:");
        // int age = sc.nextInt();

        // if(age >= 18){
        //     System.out.println("You can drink and drive");
        // }

        // else if(age > 13 && age < 18){
        //     System.out.println("Teenager");
        // }
        
        // else{
        //     System.out.println("Kimds");
        // }

        
        // Income-tax
        // System.out.println("Enter the Income:");
        // int income = sc.nextInt();
        // int Tax;

        // if(income < 500000){
        //     Tax = 0;
        // }

        // else if(income >= 500000 && income < 1000000){
        //     Tax = (int) (income * 0.2);
        // }

        // else{
        //     Tax = (int) (income * 0.3);
        // }

        // System.out.println("Your tax is: " + Tax);

        
        // Largest of 3 numbers
        System.out.println("Enter the 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number:");
        int c = sc.nextInt();

        if( a >= b && a >= c){
            System.out.println(a + " is the highest");
        }

        else if(b > c){
            System.out.println(b + " is the highest");
        }

        else{
            System.out.println(c + " is the highest");
        }

        sc.close();
    }
}
