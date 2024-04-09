import java.util.*;

public class Strings {
    
    public static void printLetters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i = 0; i < str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static float getPath(String str){
        int x = 0, y = 0;
        for(int i = 0; i < str.length(); i++){
            char dir = str.charAt(i);

            switch (dir) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;

        float shortestPath = (float)Math.sqrt(X2 + Y2);
        return shortestPath;
    }

    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args){
        
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String ("XYZ@#123");

        // System.out.println(arr);
        // System.out.println(str);
        // System.out.println(str2);

        // Strings are IMMUTABLE in Java.

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length()); //Length is a Function here

        //Concatenation
        // String firstName = "Dushyant";
        // String lastName = "Gajipara";
        // String fullName = firstName + " " + lastName;
        //System.out.println(fullName);

        //printLetters(fullName);

        // String str = "racecar";
        // System.out.println(isPalindrome(str));

        // String path = "WNEENESENNN";
        // System.out.println(getPath(path));

        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if (s1 == s2) {
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        // if (s1 == s3) {         //Here the outcome is not equal because it checks at object level.
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        // if (s1.equals(s3)) {        //Here this function checks the value.
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        //Substring
        //String str = "Hello World";
        // System.out.println(subString(str, 0, 5));

        //System.out.println(str.substring(0,7));

        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];

        for(int i = 0; i < fruits.length; i++){     //Time complexity here O(x * n), here x = no. of characters in largest string and n = no. of strings that is almost O(n^2)
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
