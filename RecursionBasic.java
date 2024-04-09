public class RecursionBasic {
    
    public static void printDec(int n){
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n){
        if (n == 0) {
            return 1;
        }
        int fn = n * fact(n-1);
        return fn;
    }

    public static int naturalNoSum(int n){
        if (n == 1) {
            return 1;
        }
        int fn = n + naturalNoSum(n-1);
        return fn;
    }

    public static int fib(int n){
        if (n == 0) {
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        int fn = fib(n-1) + fib(n-2);
        return fn;
    }

    public static boolean isSorted(int arr[], int i){
        if (i == arr.length-1) {
            return true;
        }
        
        if (arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }
    
    public static int firstOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        
        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        
        int isFound = lastOccurence(arr, key, i+1);
        
        if (isFound == -1 && arr[i] == key) {
            return i;           
        }
        
        return isFound;
    }

    public static int power(int x, int n){      //Time complexity here is O(n)
        if (n == 0) {
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int optimizedPower(int x, int n){     //Time complexity here is O(logn)
        if (n == 0) {
            return 1;
        }
        
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //condition for n = odd
        if (n%2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static int tilingProblem(int n){     //Because the floor is of 2*n
        //Base Condition
        if (n == 0 || n == 1) {
            return 1;
        }

        //kam
        //verticle choices
        int fnm1 = tilingProblem(n-1);

        //horizintal choices
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        //Kaam
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a'] == true) {
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currentChar), map);
        }
    }

    public static int friendsPairing(int n){
        if (n==1 || n==2) {
            return n;
        }
        //Choices
        //Single
        int fnm1 = friendsPairing(n-1);

        //Pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        int totalWays = fnm1 + pairWays;
        return totalWays;

    }

    public static void printBinString(int n, int lastplace, String str){
        //Base Case
        if(n == 0){
            System.out.println(str);
            return;
        }
        
        //kaam
        printBinString(n-1, 0, str+"0");

        //lastplace is 0
        if (lastplace == 0) {
            printBinString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        //int n = 25;
        // printDec(n);
        //printInc(n);
        //System.out.println(fact(n));
        //System.out.println(naturalNoSum(n));
        //System.out.println(fib(n));

        // int arr[] = {1,2,3,4};
        // System.out.println(isSorted(arr, 0));

        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 5, 0));

        //System.out.println(power(2, 10));
        //System.out.println(optimizedPower(2, 5));

        //System.out.println(tilingProblem(5));

        // String str = "aappnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friendsPairing(3));

        printBinString(3, 0, "");
    }
}
