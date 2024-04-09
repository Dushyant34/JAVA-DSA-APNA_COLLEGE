// import java.util.*;

public class BubbleSort{
    
    public static void bubbleSort(int arr[]){        
        for(int i = 0; i < arr.length - 1; i++){  //here less than sign is given
            int swap = 0;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                swap++;
                if(swap == 0){
                    break;
                }
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,4};
        bubbleSort(arr);
        printArray(arr);
    }
}