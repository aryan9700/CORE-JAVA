public class arrayQ2//Max 
{
    public static void main(String[] args) {
        int[] arr= {1,34,6,7,5,4,356,2,54,6,5,43};
        System.out.println(max(arr));
    }
    //imagine that array is not empty
    static int max(int[] arr){
        int maxVal=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
            
        }
        return maxVal;
    }
}
