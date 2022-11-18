//rotated binary search
// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
//arr=[2,4,5,7,8,9,10,12]
//after 1 rotation=arr=[12,2,4,5,7,8,9,10]
//after 2 rotation=arr=[10,12,2,4,5,7,8,9]
//appraoch 1. find the pivot in array pivot=where the particulr thing is getting changed
//12 is pivot here; 10 asc ; 2,4,5,7..ascending
//find pivot 
//search in first half simple binary search{0,pivot}
//search in second half simple binary search{p+1,end} 
/*
 * //case 1: ans=when you find mid>mid+1 element, i.e; pivot ans=mid
 * //case 2: if mid element<mid-1 then , i.e; also my answer=mid-1
 * //case 3 :start element > mid element, i.e; in this case all the element from mid will be < start.
 * hence we can ignore all this elements since we are looking for peak that is largest element
 * ignore by end=mid -1 
 * //case 4: start element < mid element then start=mid+1 // if middle have pivot then it had been caughten in 1 & 2
 * hence proved bigger no lies ahead hence ignore mid
 * //not work in duplicate array
 */

public class Q8 {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    static int search(int[] nums, int target){
        int pivot=findPivot(nums);
        //if you did not find the pivot, it means the array is not rotated;
        if (pivot== -1){
            //just do normal binary search
        return binarySearch(nums, target, 0, nums.length-1);
        }
        //if pivot is found you have found two ascending sorted arrays
        if(nums[pivot]==target){
            return pivot;
            /*1.pivot element is target element ans
            2.target>start element //search space = (s,p-1) 
            why? coz all no. after pivot are<start
            3.target<start element
            i.e, we know that all elements from s till pivot are going to be bigger than target
            search space is pivot+1 till end
             */
        }
        if(target>=nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }return binarySearch(nums, target, pivot+1 , nums.length-1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
       
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
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
       
        while (start<=end){
            int mid= start+(end-start)/2;
            //4 cases over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start] ){
                end=mid-1;
            }else{
                start=mid+1;
            }
            
            
    }return -1;
    
}}
