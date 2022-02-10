package MergSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {0, 3, 5};
        int[] arr2 = {1, 2, 4, 8};
        int[] arrResult = new int[arr2.length + arr1.length];

        arrResult = MergeSort.merge2Descending(arr1, arr2);
        for (int a : arrResult) {
            System.out.print(a + ", ");
        }
    }
}
