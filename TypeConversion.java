import java.util.*;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 5;
        long b = a;

        //possible lossy conversion
        // long a = 5;
        // int b = a;
        System.out.println(b);

        Scanner sc = new Scanner (System.in);
        float c = sc.nextInt();
        
        // possible lossy conversion
        // int c = sc.nextFloat();
        System.out.println(c);

        sc.close();
    }
}
