import java.util.Arrays;

//select a element and put it at its correct index is selection sort
/*two ways=maximum element swap with last index element
[4,5,1,2,3]
[4,3,1,2,5]
[2,3,1,4,5]
[2,1,3,4,5]
[1,2,3,4,5]
 * or you can select minimum element and put at its its correct index
 [4,5,1,2,3]
 [1,5,4,2,3]
 [1,2,4,5,3]
 [1,2,3,5,4]
 [1,2,3,4,5]
 *///total comparison O(N^2)=both worst and best case
 //stable = No
 //perform well on small lists/arrays
public class select {
    public static void main(String[] args) {
      int[] arr={2,4,6,7,3,1} ; 
      selectSort(arr);
      System.out.println(Arrays.toString(arr));
    }
    static void selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the maximum item in remaining array and swap it with correct index
            int last= arr.length-i-1;
            int maxIndex=getmaxIndex(arr,0,last);
            swap(arr, maxIndex, last);
            
        }
    }
    static void swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    private static int getmaxIndex(int[] arr, int start, int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
            
        }
        return max;
    }
}
