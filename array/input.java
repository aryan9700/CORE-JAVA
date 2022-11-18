package array;

import java.util.Arrays;
import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];
    arr[0] = 12;
    arr[1] = 88;
    arr[2] = 93;
    arr[3] = 74;
    arr[4] = 9;
    // [12,88,93,74,9]
    System.out.println(arr[3]);

    // input using for loops
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }
    System.out.println(Arrays.toString(arr));

    // for(int i=0; i<arr.length; i++){
    // System.out.print(arr[i]+" ");}

    // for(int num : arr){//for every element in array, print the element
    // System.out.println(num+" ");//here num represents elements of the array}
    // System.out.println(arr[6]); // index out of bound error

  }
}
