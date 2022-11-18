/*Q.arr=[2,3,5,9,14,16,18], target=14
ceiling=smallest element in array greater or = target
 * ceiling(arr,target=14) = 14
 * ceiling (arr, target=15) = 16
 * target =4 ceiling =5 take all array value greater than target then take smallest of them
 * when condition is violated come out of while condition
start =end+1, start > end, so end-target-start so for smallest element in array greater or = target is start
 */
public class Q1 {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};//sorted
        int target=20;
        int ans= ceiling(arr, target);
        System.out.println(ans);

    }
    //return the index of smallest no. >= target
    static int ceiling(int[] arr, int target){
          //but what if target is greater than the greatest number in array
          //if we dont write this extra code we get next index which is maximum present in array
          if(target>arr[arr.length-1]){
            return -1;
          }
        int start = 0;
        int end = arr.length - 1;
      
       
        while (start<=end){
            //find the middle element
            // (s+e)/2 may exceed the int range if it is large value, so mid = start +  {(end-start)/2}
            int mid= start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1; 
            } else if(target>arr[mid]){
                start=mid+1;
            } else{
                //ans found
                return mid;
            }
        }return start;
    }
}
