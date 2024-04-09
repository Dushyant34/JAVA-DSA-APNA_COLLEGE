public class DivideConqure {
    
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Merge Sort
    public static void mergeSort(int arr[], int si, int ei){
        //Base Case
        if (si >= ei) {
           return; 
        }

        //Kaam
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);    //Left Part
        mergeSort(arr, mid+1, ei);    //Right Part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];
        int i = si;     //iterator for left part
        int j = mid+1;      //iterator for right part
        int k = 0;      //iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for (k=0, i=si; k<temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }

    // Quick Sort
    public static void quickSort(int arr[], int si, int ei){
        //Base case
        if (si >= ei) {
            return;
        }

        //kaam
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;       //To make place for elements smaller then pivot

        for(int j=si; j<ei; j++){
            if (arr[j] <= pivot) {
                i++;
                //Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];   // pivot = arr[i] X
        arr[i] = temp;
        return i;
    }

    // Search in Sorted, Rotated Array
    public static int search(int arr[], int target, int si, int ei){
        //Base Case
        if (si > ei) {
            return -1;
        }

        //Kaam
        int mid = si + (ei-si)/2;

        //Found
        if (arr[mid] == target) {
            return mid;
        }

        //Line 1
        if (arr[si] <= arr[mid]) {
            //Case a : left of line 1
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid-1);
            }
            //Case b : right of mid
            else{
                return search(arr, target, mid+1, ei);
            }
        }
        
        //Line 2
        else{
            //Case c : right of line 2
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid+1, ei);
            }
            //Case d : left of mid
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    
    public static void main(String[] args) {
        //int arr[] = {2,6,7,9,5,-3};

        //mergeSort(arr, 0, arr.length-1);
        //printArray(arr);

        // quickSort(arr, 0, arr.length-1);
        // printArray(arr);

        int nums[] = {4,5,6,7,0,1,2};
        int target = 6;
        int targetIdx = search(nums, target, 0, nums.length-1);
        System.out.println(targetIdx);
    }
}
