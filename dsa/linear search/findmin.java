//package dsa.linear search;

public class findmin {
    public static void main(String[] args) {
        int[] arr= {19,234,56,67,4,67,-3,2,77,44,67,43,69};
        System.out.println(min(arr));
    }
    //return  the minimum value in array
    static int min(int[] arr){
        int ans =  arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]< ans){
                ans= arr[i];
                
            }
            
        }return ans;

    }
}
