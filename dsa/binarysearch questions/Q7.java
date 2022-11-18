//search in mountain array
 // https://leetcode.com/problems/find-in-mountain-array/
 /*find target in mountain array=[1,2,3,4,5,3,1] target 3
 1.find peak element=4th index
 2.Binary search in ascending array{0,4}
 3.if not found binary search in decending array
  * 
  */
public class Q7 {
    public static void main(String[] args) {
        
    }
    int search(int[] arr, int target){
int peak=findPeakElement(arr);
int firstTry=OrderAgnosticBS(arr,target,start,peak);
if(firstTry!=-1){
    return firstTry;
}
//try to search in second half
}
    return OrderAgnosticBS(arr, target, peak+1, arr.length-1);
}
    public int findPeakElement(int[] arr) {
        int start=0;
       int end=arr.length-1;
       while(start<end){
           int mid= start+(end-start)/2;
           if(arr[mid]>arr[mid+1]){
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

   static int OrderAgnosticBS(int[] arr, int target, int start, int end){
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


