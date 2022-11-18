//enhanced for loop to search element in array

public class linearsearch2{
    public static void main(String[] args) {
        int[] nums={1,34,56,88,32,4,5,6,51,43,42,56,690,29};
        int target=51;
        int ans= linearsearch2(nums,target);
        System.out.println(ans);
    }
    //search the target and return the element
    static int linearsearch2(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
        /*for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element==target){
                return element;
            }*/
            //enhanced for loop
            for (int element: arr){
                //check for element at every index if it is = target
                if(element==target){
                    return element;
                }
            }
            
         return -1;
    }
}

