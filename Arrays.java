import java.util.*;

public class Arrays {
    
    public static void update(int rollNumber[], int unchangable){
        for(int i = 0; i < rollNumber.length; i++){
            rollNumber[i] = rollNumber[i] + 1;
        }

        unchangable = 100;
    }

    public static int linearSearch(int numbers[], int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int nums[]){
        int largest = Integer.MIN_VALUE;    // -Infinity
        int smallest = Integer.MAX_VALUE;   // +Infinity

        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }

            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }

        System.out.println("The smallest elemnt in the Array is: " + smallest);
        return largest;
    }

    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            else if (numbers[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void reverse(int nums[]){
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start ++;
            end --;
        }
    }

    public static void printPairs(int number[]){
        int tp = 0;
        for(int i = 0; i < number.length; i++){
            int current = number[i];
            for(int j = i+1; j < number.length; j++){
                System.out.print("(" + current + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs =" + tp);
    }

    public static void printSubarrays(int nums[]){
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    /*// Method 1 : Time complexity = O(n^3)
    public static void maxSubarraySum(int nums[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                for(int k = i; k <= j; k++){
                    currentSum += nums[k];
                }
                System.out.println(currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("The max sum = " + maxSum);
    }*/

    // Method 2 : Time complexity = O(n^2)
    public static void maxSubarraySum(int nums[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        //calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            int start = i;
            for(int j = i; j < nums.length; j++){
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("The max sum = " + maxSum);
    }

    //Method 3 : Here Time complexity is O(n)
    public static void kadanes(int nums[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("The max subarray sum is: " + ms);
    }

    public static int trappedWater(int height[]){       //Time complexity here is O(n)
        int n = height.length;

        //Calculate left max boundary -- array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        
        //Calculate right max boundary -- array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2 ; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //Loop
        for (int i = 0; i < n; i++) {
            
            //Calculating Waterlevel
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //Calculating Trapped Water
            trappedWater += waterLevel-height[i];
        }

        return trappedWater;

    }

    public static int buyAndSellStocks(int price[]){        //Time complexity here is O(n)
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = price[i];
            }
        }

        return maxProfit;
    }
    
    public static void main(String[] args) {
        
        /*int marks[] = new int[10];
        int number[] = {11,12,13};
        String fruits[] = {"apple", "mango", "kiwi"};

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy: " + marks[0]);
        System.out.println("Chem: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        System.out.println(marks.length);*/

        /*int rollNumber[] = {25,35,45};
        int unchangable = 50;

        update(rollNumber, unchangable);

        for (int i = 0; i < rollNumber.length; i++) {
            System.out.print(rollNumber[i] + " ");
        }

        System.out.println();
        System.out.println(unchangable);*/

        /*// Linear Search
        int numbers[] = {10,20,30,40,50,60,70,80,90,100};
        int key = 430;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Element not found!");
        }
        else{
            System.out.println("Element " + key + " found at " + index + ".");
        }*/

        /*int nums[] = {2,4,9,5,7,1};
        System.out.println("The largest element in the Array is: " + getLargest(nums));*/

        /*// Binary Search
        int numbers[] = {10,20,30,40,50,60,70,80,90,100};
        int key = 60;
        
        int index = binarySearch(numbers, key);
        if (index == -1) {
            System.out.println("Element not found!");
        }
        else{
            System.out.println("Element " + key + " found at " + index + ".");
        }*/

        /*// Reverse Array
        int nums[] = {10,20,30,40,50,60,70,80,90,100};
        reverse(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();*/

        /*//Print pairs
        int number[] = {10,20,30,40,50,60,70,80,90,100};
        printPairs(number);*/

        /*//Print subarray
        int number[] = {10,20,30,40,50};
        printSubarrays(number);*/

        /*//Print Maxsum
        int nums[] = {2,3,-1,7,10};
        maxSubarraySum(nums);*/

        /*//Kades's Algo
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(nums);*/

        /*//Trapped Water
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("The amount of trapped water is : " + trappedWater(height));*/

        //BuyAndSellStocks
        int price[] = {7,1,5,3,6,4};
        System.out.println("The maximum profit is: " + buyAndSellStocks(price));
    }
}
