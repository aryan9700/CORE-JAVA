//Find First and Last Position of Element in Sorted Array==>facebook interview
public class Q4{
    public static void main(String[] args) {
   
    } 
    static int[] searchRange(int[] nums, int target){
        int[] ans={-1,-1};
        //check for first occurence if target first
        int start=search(nums, target,true);
        int end=search(nums, target, false);
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }
    //this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex){
        int ans=-1;
        int start = 0;
        int end = nums.length - 1;
       
        while (start<=end){
            
            //find the middle element
            // (s+e)/2 may exceed the int range if it is large value, so mid = start +  {(end-start)/2}
            int mid= start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1; 
            } else if(target>nums[mid]){
                start=mid+1;
            } else{
                //potential ans found
                ans= mid;
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
    }return ans;
}}