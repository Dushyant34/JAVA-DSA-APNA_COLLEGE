import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        // ArrayLists are part of Java Collection Framework.
        // ClassName objectName = new ClassName();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Add Operation
        list.add(1);    //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // list.add(1, 12);    //O(n)

        // System.out.println(list);

        // Get Operation - O(1)
        // int element = list.get(2);
        // System.out.println(element);

        // Remove operation - O(n)
        // list.remove(2);
        // System.out.println(list);

        // Set Operation - O(n)
        // list.set(2, 10);
        // System.out.println(list);

        // Contains Operation - O(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        // Size Operation
        // System.out.println(list.size());

        // Print ArrayList
        // for(int i = 0; i < list.size(); i++){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // Reverse ArrayList - O(n)
        // for(int i = list.size()-1; i >= 0; i--){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // Max in ArrayList - O(n)
        // list2.add(2);
        // list2.add(5);
        // list2.add(9);
        // list2.add(3);
        // list2.add(6);

        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < list2.size(); i++){
        //     // if (list2.get(i) > max) {
        //     //     max = list2.get(i);
        //     // }

        //     max = Math.max(max, list2.get(i));
        // }
        // System.out.println("Max element is: " + max);

        // Swap 2 elements
        list2.add(2);
        list2.add(5);
        list2.add(9);
        list2.add(3);
        list2.add(6);

        // int idx1 = 1, idx2 = 3;
        // System.out.println(list2);
        // swap(list2, idx1, idx2);
        // System.out.println(list2);

        // Sorting ArrayList
        System.out.println(list2);
        Collections.sort(list2);    //Ascending    
        System.out.println(list2);

        //Desending
        // Collections.sort(list2, Collections.reverseOrder());
        //Comparators - Functions that defines logic
        // System.out.println(list2);

        // Multi-dimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        // ArrayList<Integer> list3 = new ArrayList<>();
        // list3.add(1); list3.add(2);
        // mainList.add(list3);

        // ArrayList<Integer> list4 = new ArrayList<>();
        // list4.add(3); list4.add(4);
        // mainList.add(list4);

        // System.out.println(mainList);

        // for(int i = 0; i < mainList.size(); i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for (int j = 0; j < currList.size(); j++) {
        //         System.out.print(currList.get(j) + " ");
        //     }
        //     System.out.println();
        // }

        ArrayList<Integer> list5 = new ArrayList<>();
        ArrayList<Integer> list6 = new ArrayList<>();
        ArrayList<Integer> list7 = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            list5.add(i * 1);
            list6.add(i * 2);
            list7.add(i * 3);
        }

        mainList.add(list5);
        mainList.add(list6);
        mainList.add(list7);
        list6.remove(3);
        list6.remove(2);

        System.out.println(mainList);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size();j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
