public class AdvancedPattern {
    
    public static void hollow_rectangle(int totRows, int totCols){
        //Outer loop
        for(int i=1; i<=totRows; i++){
            //Inner loop
            for(int j=1; j<=totCols; j++){
                //For boundry condition
                if (i == 1 || j==1 || i == totRows || j == totCols) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void rotated_inverted_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            //Inner loop for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //Inner loop for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void inverted_half_number_pyramid(int n){
        for(int i=1; i<=n; i++){
            //Inner loop for number
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void flyod_triangle(int n, int number){
        for(int i=1; i<=n; i++){
            //Inner loop for number
            for(int j=1; j<=i; j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }

    public static void one_zero_pyramid(int n){
        for(int i=1; i<=n; i++){
            //Inner Loop
            for(int j=1; j<=i; j++){
                if ((i+j)%2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        //Code for 1st half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Code for 2nd half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rhombus(int n){
        //Outer Loop
        for(int i=1; i<=n; i++){
            //Inner Loop for Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner Loop for Stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void hollow_rhombus(int n){
        //Outer Loop
        for(int i=1; i<=n; i++){
            //Inner Loop for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner Loop for Stars
            for(int j=1; j<=n; j++){
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        //Outer loop for 1st half
        for(int i=1; i<=n; i++){
            //Inner loop for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop for stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Outer loop for 2nd half
        for(int i=n; i>=1; i--){
            //Inner loop for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop for stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n){
        for(int i=1; i<=n; i++){
            // Blank Space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Number
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void palindromicPyramid(int n){
        // Outer Loop
        for(int i = 1; i <= n; i++){
            
            //Inner Loops - Blank Space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            // Palindromic Number - Descending 
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            // Palindromic Number - Ascending
            for (int j = 2; j <= i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //hollow_rectangle(4, 5);
        //rotated_inverted_half_pyramid(6);
        //inverted_half_number_pyramid(5);
        //flyod_triangle(5, 1);
        //one_zero_pyramid(5);
        //butterfly(4);
        //rhombus(5);
        //hollow_rhombus(7);
        //diamond(4);
        //numberPyramid(5);
        palindromicPyramid(5);
    }
}
