public class Backtracking {
    
    public static void changeArray(int arr[], int index, int value){
        //Base Case
        if (index == arr.length) {
            printArray(arr);;
            return;
        }

        //Kaam - Recursion
        arr[index] = value;
        changeArray(arr, index+1, value+1);     //Function call step
        arr[index] = arr[index] - 2;        //Backtracking step
    }
    
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Total no. of subsets of Stirng
    public static void findSubsets(String str, String ans, int i){
        //Base Case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //Recursion
        //Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No choice 
        findSubsets(str, ans, i+1);
    }

    // Total no. of permutations of Stirng
    public static void permutation(String str, String ans){
        //Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        //Recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            
            //"abcde" => "ab" + "de" = "abde"
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutation(newStr, ans+curr);
        }
    }

    // N - Queens
    // public static void nQueens(char board[][], int row){
    //     //Base Case
    //     if (row == board.length) {
    //         printBoard(board);
    //         count++;
    //         return;
    //     }

    //     //Column Loop
    //     for(int j=0; j<board.length; j++){
            
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             nQueens(board, row + 1);  //Function call
    //             board[row][j] = 'X';    //Backtracking step
    //         }

    //     }
    // }

    // N - Queens - Print 1 Solution
    public static boolean nQueens(char board[][], int row){
        //Base Case
        if (row == board.length) {
            printBoard(board);
            count++;
            return true;
        }

        //Column Loop
        for(int j=0; j<board.length; j++){
            
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                
                if (nQueens(board, row + 1)) {
                    return true;
                }

                board[row][j] = 'X';    //Backtracking step
            }

        }

        return false;
    }

    public static boolean isSafe(char board[][], int row, int col){
        //Vertical up
        for(int i = row-1; i >= 0; i--){
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        
        //Diagonaly left
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){  //Keep in mind condn ke bich me && lagaya hai
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        //Diagonaly right
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("-----Chess Board-----");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Grid Ways
    public static int gridWays(int i, int j, int n, int m){
        //Base Case
        if (i == n-1 && j == m-1) {
            return 1;
        }
        else if(i == n || j == m){
            return 0;
        }

        //Recursion
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);

        return w1+w2;
    }

    // Grid Ways - Optimal
    public static int optimalGridWays(int n, int m){
        int totalchars = (n-1) + (m-1);
        int repeating1 =  n-1;
        int repeating2 = m-1;

        for(int i = totalchars-1; i>0; i--){
            totalchars = totalchars * i;
        }

        for(int j = n-2; j > 0; j--){
            repeating1 = repeating1 * j;
        }

        for(int k = m-2; k > 0; k--){
            repeating2 = repeating2 * k;
        }

        return (totalchars/(repeating1*repeating2));
        
    }

    // Sudoku

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        // Base case
        if(row == 9){
            return true;
        }

        // Recursion
        int nextRow = row, nextCol = col+1;
        if (col+1 == 9) {
            nextRow = row+1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit=1; digit<=9; digit++){
            if (isSSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {    //Soln exists
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    public static boolean isSSafe(int sudoku[][], int row, int col, int digit){
        //column
        for(int i=0; i<9; i++){
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        //row
        for(int j=0; j<9; j++){
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        //3*3 grid
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }


    static int count = 0;
    public static void main(String[] args) {
        
        // int arr[] = new int[5];
        // changeArray(arr, 0, 1);
        // printArray(arr);

        // String str = "abc";
        // findSubsets(str, "", 0);

        // String str = "abc";
        // permutation(str, "  ");

        // N - Queens
        // int n = 2;
        // char board[][] = new char[n][n];
        
        // //Initialization
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         board[i][j] = 'X';
        //     }
        // }
        
        // if (nQueens(board, 0)) {
        //     System.out.println("Soltion is possible.");
        //     printBoard(board);
        // }
        // else{
        //     System.out.println("Solution is not possible.");
        // }

        // System.out.println("Total no. of ways to solve N-Queens: " + count);

        // Grid Ways
        // int n = 3, m = 3;
        // System.out.println(gridWays(0, 0, n, m));

        // Grid Ways - Optimal
        // int n = 3, m = 3;
        // System.out.println(optimalGridWays(n,m));

        // Sudoku
        int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0},
        {9, 6, 0, 4, 0, 5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4},
        {0, 4, 9, 0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }
        else{
            System.out.println("Solution does not exists");
        }
    }
}
