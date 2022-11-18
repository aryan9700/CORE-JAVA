public class linearsearch3{
    public static void main(String[] args) {
        int[] nums={1,34,56,88,32,4,5,6,51,43,42,56,690,29};
        int target=51;
        boolean ans= linearsearch3(nums,target);
        System.out.println(ans);
    }
    //search the target and return true or false
    static boolean linearsearch3(int arr[], int target){
        if(arr.length == 0){
            return false;
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
                    return true;
                }
            }
            
         return false;
    }
}