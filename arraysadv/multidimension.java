import java.util.Arrays;
import java.util.Scanner;

//package arraysadv;

public class multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * 1 2 3 
         * 4 5 6 
         * 7 8 9 
         */
        //int [][] arr = new int[3][3];
     /*   int [][] arr = new int [3][];
        arr={
    {1,2,3}// oth index
            {4,5}//1st index
            {6,7,8,9}//2nd index-> arr[2]={6,7,8,9}

    }; */
   
    int[][] arr= new int[3][3];
         System.out.print(arr.length);//no.of rows
 //input in arrays 2d
            for(int row=0; row<arr.length ; row++){
                //for each column in every row
                for(int col=0; col< arr[row].length; col++){
                    arr[row][col] = in.nextInt();
                } 
            }
            //1.output in arrays 2d
        /*     for(int row=0; row<arr.length ; row++){
                //for each column in every row
                for(int col=0; col< arr[row].length; col++){
                    System.out.print(arr [row][col]+" ");
                }System.out.println();
                
            }*/
            // 2.output by to.string method
        /*    for(int row=0; row<arr.length ; row++){
                System.out.println(Arrays.toString(arr[row]));
            }
            */ 
            //3.output by enhanced for loop
            //in arr element every element is itself an array
            //int[] array itself is a datatype
            for(int[] a : arr){
                System.out.println(Arrays.toString(a));
            }

}
}