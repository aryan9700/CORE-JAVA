public class binarysearch{
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,6,8,10,13,18,25,29,38,45,56,75,85,96};//sorted
        int target=85;
        int ans= binarySearch(arr, target);
        System.out.println(ans);

    }
    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
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
        }return -1;
    }
}