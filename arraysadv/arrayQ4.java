import java.util.Arrays;
public class arrayQ4 //reverse a array
{
    public static void main(String[] args) {
        int[] arr= {1,23,45,77,87};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1; //becoz index start with 0,1,2

        while(start < end){
            //swap
            swap(arr, start, end);
            start++;
            end--;

        }}
        static void swap(int[] arr,int index1 , int index2){
            int temp = arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
           }
}
