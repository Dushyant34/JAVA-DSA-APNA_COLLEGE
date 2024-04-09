public class CountSort {
    
    public static void countingSort(int arr[]){
        int range = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            range = Math.max(range, arr[i]);
        }

        int count[] = new int[range + 1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {1,4,1,3,2,4,2,7};
        countingSort(arr);
        printArray(arr);
    }
}
