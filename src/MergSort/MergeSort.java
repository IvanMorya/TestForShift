package MergSort;

public class MergeSort {

    public static int[] mergeAscending(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int [] res = new int [len1 + len2];
        int i = 0, j = 0, k = 0;
        while(i < len1 && j < len2) {
            res[k++] = arr1[i] < arr2[j]? arr1[i++] : arr2[j++];
        }
        while(i < len1) {
            res[k++] = arr1[i++];
        }
        while(j < len2) {
            res[k++] = arr2[j++];
        }
        return res;
    }

    public static int[] mergeDescending(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int [] res = new int [len1 + len2];
        int i = arr1.length - 1, j = arr2.length - 1, k = 0;
        while(i >= 0 && j >= 0) {
            res[k++] = arr1[i] > arr2[j]? arr1[i--] : arr2[j--];
        }
        while(i >= 0) {
            res[k++] = arr1[i--];
        }
        while(j >= 0) {
            res[k++] = arr2[j--];
        }
        return res;
    }
}
