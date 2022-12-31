// https://leetcode.com/problems/set-mismatch/
//One no is missing
//one no is repeating
//missing no= index +1
//duplicate = no. at the missing index
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        
    int i=0;
    while(i<nums.length){
        int correct=nums[i]-1;
        if ( nums [i] != nums[correct]){
            swap(nums,i,correct);
        }else{ i++;
        }
    }
    //search for first missing no.
    for(int index= 0; index< nums.length; index++){
        if (nums[index]!=index+1){
            return new int[]{nums[index],index+1};
        }
    }return new int[]{-1,-1};
}
      static void swap(int[] nums,int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
