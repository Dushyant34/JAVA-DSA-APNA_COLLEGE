import java.util.*;

public class SumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int sum = a+b;
        int product = a * b;
        System.out.println(product);

        sc.close();
    }
}
