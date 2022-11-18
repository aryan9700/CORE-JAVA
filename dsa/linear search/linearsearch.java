/*TIME COMPLEXITY-Linear Search {1,3,5,7,8,34,56} search index of 34 = 5th becoz counting start with 0,1,2,.. if no
value found return -1
 * 0(1)//CONSTANT==find at oth index==constant 1
 *  / worst case 0(N);N=size of Array ==== item not present in array==linear graph time complexity
 */

 public class linearsearch{
    public static void main(String[] args) {
        int[] nums={1,3,5,6,7,34,44,232,59,40,32};
        int target = 34;
        int ans= linearsearch(nums, target);
        System.out.println(ans);
        
    }//search in the array return the index if item found
    //otherwise if item not found return -1 or return Integer.MAX_VALUE{becoz -1 might be a value of given array}
    
    static int linearsearch(int arr[], int target){
        if (arr.length== 0){
            return -1;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target 
            int element = arr[index];
            if (element== target){
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return-1;
    }
 }