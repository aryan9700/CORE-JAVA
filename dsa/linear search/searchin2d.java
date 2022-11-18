import java.util.Arrays;
import java.lang.Integer;

public class searchin2d {
    public static void main(String[] args) {
        int [][] arr = {
            {1,3},
            {2,4,6},
            {7,8,9,5},
            {11,45}
        };
        int target= 5;
        int[] ans=search(arr, target);//format of return value{row,col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
            
        }return new int[]{-1,-1};
    }
    //for max value
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        /*for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max= arr[row][col];
                }
            }
            
        }
         */
        //enhanced for loop
        for(int[] ints:arr){
            for(int elements:ints){
                if(elements>max){
                    max=elements;
                }
            }
        }

        return max;
}

}
