public class orderAgnostic{
    public static void main(String[] args) {
        // int[] arr={-18,-12,-4,0,2,3,4,6,8,10,13,18,25,29,38,45,56,75,85,96};
        int[] arr={98,85,75,56,45,38,29,25,18,13,10,8,6,4,3,2,0,-4,-12,-18};
        int target =75;
        int ans= OrderAgnosticBS(arr,target);
        System.out.println(ans);
        
    }
    static int OrderAgnosticBS(int[] arr, int target){
       int start=0;
       int end=arr.length - 1;
       //find whether the array is sorted in ascending or decending
       boolean isAsc=arr[start] < arr[end];
       /*  if(arr[start] < arr[end]){ 
            isAsc=true;
        }else {
            isAsc=false;
    }*/
    while (start<=end){
        //find the middle element
        // (s+e)/2 may exceed the int range if it is large value, so mid = start +  {(end-start)/2}
        int mid= start+(end-start)/2;

        if (arr[mid] == target){
            return mid;
        }
        if(isAsc){
        if (target<arr[mid]){
            end=mid-1; 
        } else{
            start=mid+1;
        } }
        else
        {if (target>arr[mid]){
            end=mid-1; 
        } else{
            start=mid+1;
        }
            
        }
    }return -1;
}
}