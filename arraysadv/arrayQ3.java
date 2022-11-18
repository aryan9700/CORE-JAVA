public class arrayQ3 //max value of range 
{
    public static void main(String[] args) {
        int[] arr= {1,34,6,7,5,4,356,2,54,6,5,43};
        System.out.println(maxRange(arr, 1, 7));
        
    }
    //imagine that array is not empty
    static int maxRange(int[] arr, int start, int end){
        int maxVal=arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
            
        }
        return maxVal;
    }}


