import java.util.Arrays;

public class code{
    public static void main(String[] args) {
        int[] arr={2,1,5,7,4,8,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;//this line is to not repeat same step if array is already sorted
        //run the steps N times
        for (int i = 0; i < arr.length; i++) {
            //for each step, max item will come atthe last respective index
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {//or j<=arr.length-i-1
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
         //if you did not swap for a particular value of i it means array is sorted hence stop the program 
         if(!swapped)  { //!false=true
            break;
         }
        }
    }
}