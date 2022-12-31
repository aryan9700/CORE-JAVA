import java.util.Arrays;

//0 1 2 3 4 i<=n-2  j>0
//5,3,4,1,2  0       1
/*           1       2
  j
3,4,5,1,2 /when element j is not smaller than element j-1 then break the loop
reson because this left hand side array is alreay sorted
ex-2,3,4,5,6  /2-5 already sorted 6(j)
1,3,4,5,2 till index 3 it is sorted now i=3,j=4
                                        i=4,j=5
                                        hence i<=N-2,index out of bound
                                        COMPLEXITY: worst case:O(N^2){N=no.of element} decending sorted 5,4,3,2,1
                                        best case complexity when array is already sorted (N-1){LINEAR} O(N)

why we use insertion sorts?
1.adaptivesteps get reduced when array is sorted
no of swaps reduced as compared to bubble sort
2.stable
3.use for smaller value of N
4.work best when array is partially sorted
it take part in hybrid sorting algorithm
                                        */ 
public class insertion{
  public static void main(String[] args) {
    int[] arr={4,5,1,2,3};
    insertion(arr);
    System.out.println(Arrays.toString(arr));

}
static void insertion(int[] arr) {
for (int i = 0; i < arr.length-1; i++)//i<=arr.length-2
for (int j = i+1; j >0; j--) {
    if(arr[j]<arr[j-1]){
        swap(arr,j , j-1);
    } else break;} }

static void swap(int[] arr,int first, int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}}
