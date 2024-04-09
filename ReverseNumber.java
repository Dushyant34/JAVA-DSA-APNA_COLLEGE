public class ReverseNumber {
    public static void main(String[] args) {
        int n = 210304;

        /* //Methode 1
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);

            n = n / 10;
        }*/ 

        //Method 2
        while (n > 0) {
            int rev = 0;
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;

            System.out.print(rev);
        }

    }
}
