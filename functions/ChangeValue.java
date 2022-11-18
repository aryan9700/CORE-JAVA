package functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = { 1, 2, 4, 6, 60 };
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums) {
        nums[0] = 99;// if you make a change to the object via this reference variable, same object
                     // will be changed
    }
}
