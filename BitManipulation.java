public class BitManipulation {
    
    public static void oddOrEven(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0) {     // Condn for Even
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }

    public static void getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            System.out.println("The bit at " + i + "th position is: 0");
        }
        else{
            System.out.println("The bit at " + i + "th position is: 1");
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }
            
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return (n | bitMask);
    }

    public static int clearIBits(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = (~0) << (j+1);
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // Check our LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int N){   // Time Complexity using this approach is O(log n).
        int ans = 1;
        while (N > 0) {
            if ((N & 1) != 0) {  // Check our LSB
                ans = ans * a;
            }
            a = a * a;
            N = N >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        
        // Bitwise Operator
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~ 5);
        // System.out.println(5 << 2);
        // System.out.println(6 >> 1);

        // oddOrEven(2);
        // oddOrEven(21);
        // oddOrEven(11);

        //getIthBit(15, 4);

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearIthBit(10, 1));

        // System.out.println(updateIthBit(10, 2, 1));

        // System.out.println(clearIBits(15, 2));

        // System.out.println(clearBitsInRange(10, 2, 4));

        // System.out.println(isPowerTwo(18));

        // System.out.println(countSetBits(16));

        System.out.println(fastExpo(3, 5));

    }
}
