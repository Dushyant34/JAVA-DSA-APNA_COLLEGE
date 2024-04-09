import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("Enter the Operator: ");
        char Operator = sc.next().charAt(0);

        switch(Operator){
            case '+':
            System.out.println(a+b);
            break;

            case '-':
            System.out.println(a-b);
            break;

            case '*':
            System.out.println(a*b);
            break;

            case '/':
            System.out.println(a/b);
            break;

            case '%':
            System.out.println(a%b);
            break;

        }

        sc.close();
    }
}
