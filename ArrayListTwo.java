import java.util.ArrayList;

public class ArrayListTwo {

    public static int storeWater(ArrayList<Integer> height){
        
        // Brute Force - O(n^2)
        // int maxWater = 0;
        // for(int i = 0; i < height.size(); i++){
        //     for(int j = i+1; j < height.size(); j++){
        //         int ht = Math.min(height.get(i), height.get(j));
        //         int width = j - i;
        //         int currWater = ht * width;
        //         maxWater = Math.max(currWater, maxWater);
        //     }
        // }
        // return maxWater;

        // 2 Pointer Approach - O(n)
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp < rp){
            // Calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht * width;
            maxWater = Math.max(currWater, maxWater);

            //Pointer updation
            if (height.get(lp) < height.get(rp)) {
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }

    public static boolean pairSum1(ArrayList<Integer> list, int target){
        
        //Brute Force - O(n^2)
        // for(int i=0; i<list.size(); i++){
        //     for(int j=i+1; j<list.size(); j++){
        //         if (list.get(i) + list.get(j) == target) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //2 Pointer approach - O(n)
        int lp = 0;
        int rp = list.size()-1;

        while (lp != rp) {
            //case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            //case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target){    // TC = O(n)
        int bp = -1;
        int n = list.size();

        for(int i=0; i<list.size(); i++){
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int lp = bp+1;   //smallest
        int rp = bp;    //largest

        while (lp != rp) {
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;    //Modular Arithmetic
            }
            else{
                rp = (n + rp - 1) % n;    //Modular Arithmetic
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> height= new ArrayList<>();
        // // 1, 8, 6, 2, 5, 4, 8, 3, 7
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);

        // System.out.println(storeWater(height));

        // ArrayList<Integer> list = new ArrayList<>();
        // // 1, 2, 3, 4, 5
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // int target = 5;
        // System.out.println(pairSum1(list, target));

        ArrayList<Integer> list2 = new ArrayList<>();
        // 11, 15, 6, 8, 9, 10
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        int target = 16;
        System.out.println(pairSum2(list2, target));
    }
}
