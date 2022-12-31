// https://leetcode.com/problems/first-missing-positive/
//ignore all that are negative[3,4,-1,1] and >N :n= length of array
public class MissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i=0;
            while(i<nums.length){
                int correct=nums[i]-1;
                if (nums[i]>0 && nums[i]<= nums.length && nums [i] != nums[correct]){
                    swap(nums,i,correct);
                }else{ i++;
                }
            }
            //search for first missing no.
            for(int index= 0; index< nums.length; index++){
                if (nums[index]!=index+1){
                    return index+1;
                }
            }
            return nums.length+1;//when n is not there in array
        }
            static void swap(int[] nums,int first, int second){
                int temp=nums[first];
                nums[first]=nums[second];
                nums[second]=temp;
            }
}
