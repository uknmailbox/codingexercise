package arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {
    public static void main(String args[]) {
        int[] arr1 = new int[] {0, 1, 3, 6, 9};
        int[] arr2 = new int[] {3, 4, 5, 6, 7, 8};

        new MergeSortedArrays().mergeSortedArrays(arr1, arr2);
    }

    private int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        if(arr1 == null || arr1.length == 0) return arr2;

        if(arr2 == null ||arr2.length == 0) return arr1;

        List<Integer> list = new ArrayList<>();


        return list.toArray(new Integer[list.size()]);
    }
}
