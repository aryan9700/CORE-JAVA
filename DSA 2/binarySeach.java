/*Working of variable in Recursions
a. in the Arguments 
b. in the return type
c. in the body of functions
TIP- make sure to return the result of a function call of the return type 
step 1. comparing O(1)
step 2. divide it in 2 half O(N/2)
F(N)=0(1) + F(N/2)  //recurrence relation
Types of reccurence relation
1. linear recurrence relation-->fibo, subtracted or added linearly{very inefficient} for bigger no. same step 
repeated many time slow result so we solve it in Dynamic Programming.
2. divide and conqueror recurrence relation-->Binary Search , divide the function into factors
*/
public class binarySeach {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,55,66,78};
        int target=66;
        System.out.println(searchBinary(arr, target, 0, arr.length-1));
    }
    static int searchBinary(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m =s + (e-s) /2;
        if(arr[m] == target){
            return m;
        }
        if (target<arr[m]){
            return searchBinary(arr, target, s, m-1);
        }
        return searchBinary(arr, target, m+1, e);
    }
}
