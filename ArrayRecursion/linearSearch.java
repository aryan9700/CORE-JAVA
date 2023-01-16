package ArrayRecursion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 11, 8, 9, 11, 11, 15, 18 };
        // System.out.println(Search(arr, 11, 0));
        // System.out.println(indexSearch(arr, 11, 0));
        // System.out.println(indexSearchlast(arr, 11, arr.length - 1));
        // AllindexSearch(arr, 11, 0);
        // System.out.println(list);
        // ArrayList<Integer> ans = AllindexSearch(arr, 11, 0, new ArrayList<>());
        // System.out.println(ans);
        System.out.println(AllindexSearch2(arr, 11, 0));

    }

    static boolean Search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || Search(arr, target, index + 1);
    }

    static int indexSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return indexSearch(arr, target, index + 1);
        }
    }

    static int indexSearchlast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return indexSearchlast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void AllindexSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        AllindexSearch(arr, target, index + 1);
    }

    static ArrayList<Integer> AllindexSearch(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return AllindexSearch(arr, target, index + 1, list);
    }

    static ArrayList<Integer> AllindexSearch2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFrombelowCalls = AllindexSearch2(arr, target, index + 1);
        list.addAll(ansFrombelowCalls);
        return list;
    }
}
