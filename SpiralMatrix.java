public class SpiralMatrix {
    
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {  //significance of this condn is when n*n is odd and n*m matrix comes
            //top
            for(int j = startColumn; j <= endColumn; j++ ){
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endColumn] + " ");
            }

            //bottom
            for(int j = endColumn - 1; j >= startColumn; j-- ){
                if (startColumn == endColumn) { //This plays significance when the rows are greater than column and we don't want central part to repeat
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //left
            for(int i = endRow - 1; i >= startRow+1; i--){
                if (startRow == endRow) { //This plays significance when the columns are greater than rows and we don't want central part to repeat
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }

            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }

        System.out.println();

    }

    public static int diagonalMatrix(int matrix[][]){
        int sum = 0;

        // for(int i = 0; i < matrix.length; i++){        //Time complexity here is O(n^2)
        //     for(int j = 0; j < matrix[0].length; j++){
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i = 0; i < matrix.length; i++){          //Time complexity here is O(n)
            //pd
            sum += matrix[i][i];
            //sd
            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i];
            }
        }

        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0; 
        int column = matrix[0].length-1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == key) {
                System.out.println("Element found at (" + row + "," + column + ")");
                return true;
            }
            else if (key < matrix[row][column]){
                column--;
            }
            else{
                row++;
            }
        }

        System.out.println("Element not found!");
        return false;

    }

    public static void main(String[] args){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};

        //printSpiral(matrix);
        //System.out.println(diagonalMatrix(matrix));
        staircaseSearch(matrix, 33);
    }
}
