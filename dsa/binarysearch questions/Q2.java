//Q.find the floor of a number
//floor = greatest number smaller or = target
//same as Q1 just put end in return statement
// when condition is violated come out of while condition
//start =end+1, start > end, so end-target-start so for smaller no. end is the greatest smaller no. to the target
public class Q2{
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};//sorted
        int target=10;
        int ans= floor(arr, target);
        System.out.println(ans);

    }
    //return the index: greatest no. <= target
    static int floor(int[] arr, int target){
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
        }return end;
    }
}




