//mountain array-[1,2,4,6,8,6,5,4,2,1,0] or bitonic array 
//find peak or maximum no in answer
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
 // https://leetcode.com/problems/find-peak-element/
public class Q6 {
    public static void main(String[] args) {
        
    }
    public int findPeakElement(int[] nums) {
        int start=0;
       int end=nums.length-1;
       while(start<end){
           int mid= start+(end-start)/2;
           if(nums[mid]>nums[mid+1]){
               //you are in decreasing part of array
               //this may be the answer but look at left
               //this is why end!=mid-1
               end=mid;
           }else{
               //you are in asc part of array
               start=mid+1;//because we know that mid+1 element >mid element
           }
       }
       //in the end start==end and pointing to the largest number because 
       //of the two check above
       //start and end always trying to find the max element in the above two checks
       //hence when they are pointing to just one element, that is the max one because that is the two checks says
       //more eleboration :at every point of time for start and end, they have the best possible answer till that time 
       //and if we are saying that only one item is remaining, hence cuz of the above line, that is the best possible answer 
   return start;//or end because both are equal
   
   }
}

