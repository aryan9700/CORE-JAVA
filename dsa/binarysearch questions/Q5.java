//find target element in infinite array
//we dont know the end so we apply binary search from end to start
/*as we know end=1 and start = N then N/2,N/4,N/8...1 
time complexity O(log(N))*/
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class Q5{
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        //first find a range
        //we start with box of size 2
        int start=0;
        int end=1;
        //condition for the target to lie in the range
        while(target>arr[end]){
            int newStart=end+1;
            //double the box value
            //end=previous end + size of box * 2; end=end-(start-end)
            end= end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
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
        }return -1;
    }

}