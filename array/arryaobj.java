package array;

import java.util.Arrays;
import java.util.Scanner;

public class arryaobj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // arrays of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // modify
        str[3] = "aryan";
        System.out.println(Arrays.toString(str));

    }

}
