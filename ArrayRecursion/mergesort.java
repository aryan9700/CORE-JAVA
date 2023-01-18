package ArrayRecursion;

//time complexity : O(N*(logN));
//space complexity : height of tree; auxilary space O(n)
import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        // arr = merge(arr);
        mergeinplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));
        return mergeSort(left, right);
    }

    private static int[] mergeSort(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the array is not complete
        // copy the remaining element
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    // _____________________________??_______________________________________________________________________//
    static void mergeinplace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = s + ((e - s) / 2);
        mergeinplace(arr, s, mid);
        mergeinplace(arr, mid, e);
        mergeSortinplace(arr, s, mid, e);
    }

    private static void mergeSortinplace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the array is not complete
        // copy the remaining element
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }

    }
}
