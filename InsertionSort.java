import java.util.Arrays;

public class InsertionSort {
    
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;
        }
    }

    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args){
        Integer arr[] = {5,1,4,3,2};
        
        //insertionSort(arr);

        //Arrays.sort (arr);
        Arrays.sort (arr,0,3); //ending index is not included

        //reverse order directly
        //Arrays.sort(arr,Collections.reverseOrder(null));
        //Arrays.sort(arr,0,3, Collections.reverseOrder(null));

        printArray(arr);
    }
}
