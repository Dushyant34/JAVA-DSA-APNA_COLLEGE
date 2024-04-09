import java.util.*;

public class Functions {
    
    public static void helloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1, int num2){ // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static int numMultiplication(int a, int b){
        int product = a * b;
        return product;
    }

    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static int binoCoeff(int n, int r){
        int n_fact = factorial(n); //using helper function to calculate factorial
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int bc = n_fact / (r_fact * nmr_fact);

        return bc;
    }

    /*public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }*/

    //Optimised method to write above function
    //Only for numbers >= 2
    public static boolean isPrime(int n){
        //Corner case (2)
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){ //true //Using helper function
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void binTodec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)(Math.pow(2, pow)));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("The decimal of " + myNum + " = " + decNum);
    }

    public static void decTobin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)(Math.pow(10, pow)));
            pow++;
            decNum = decNum/2;
        }

        System.out.println("The binary of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //helloWorld();

        // 1.Calling the function to calculate Sum
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int SUM = calculateSum(a, b); // arguments or actual parameters
        // System.out.println("The sum is: " + SUM);

        // 2.Calling the function for Multiplication of two numbers.
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int Multiple = numMultiplication(a, b);
        // System.out.println("Multiplication of the number is: " + Multiple);

        // 3.Calling the function to calculate factorial of the given number
        // int n = sc.nextInt();
        // int Factorial = factorial(n);
        // System.out.println("The factorial of the number is: " + Factorial);
        
        // 4.Calling the function to calculate the Binomial Coefficient of the numbers
        // int n = sc.nextInt();
        // int r = sc.nextInt();
        // int BinCoeff = binoCoeff(n, r);
        // System.out.println("The Binomial Coefficient of the number is: " + BinCoeff);

        // 5.Calling the function to check whether the given number is prime or not
        //System.out.println(isPrime(12));

        // 6. Calling function to print the range of prime numbers till number n
        //primeRange(10);

        // 7. Calling function to convert binary digit in decimal digit
        //binTodec(111);

        // 8. Calling function to convert decimal digit in binary digit 
        decTobin(10);

        sc.close();
    }
}
