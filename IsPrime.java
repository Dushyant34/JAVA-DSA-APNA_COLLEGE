import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("The number is Prime.");
        } else {
            boolean IsPrime = true;
            for(int i = 2; i <= Math.sqrt(n); i++){ //To improve the efficiency of the code
                if(n % i == 0){
                    IsPrime = false;
                }
            }

            if (IsPrime == true) {
                System.out.println("The number is Prime.");
            }
            else{
                System.out.println("The number is not Prime.");
            }
        }

        sc.close();
    }
}
