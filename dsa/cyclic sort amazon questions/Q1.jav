//find missing no in array [0,till N] total there is N+1 Numbers [0,1,2,3,4] total no=5;
// https://leetcode.com/problems/missing-number/
// Amazon Question

public class Q1{
    public static void main(String[] args) {
        
    } 
        public int missingNumber(int[] nums) {
            int i=0;
                while(i<nums.length){
                    int correct=nums[i];
                    if (nums[i]< nums.length && nums [i] != nums[correct]){
                        swap(nums,i,correct);
                    }else{ i++;
                    }
                }
                //search for first missing no.
                for(int index= 0; index< nums.length; index++){
                    if (nums[index]!=index){
                        return index;
                    }
                }
                return nums.length;//when n is not there in array
            }
                static void swap(int[] nums,int first, int second){
                    int temp=nums[first];
                    nums[first]=nums[second];
                    nums[second]=temp;
                }
        }