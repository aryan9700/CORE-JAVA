import java.util.Arrays;

//search in range of index between 1-8

public class range {
    public static void main(String[] args) {
        int[] arr={1,34,56,88,32,4,5,6,51,43,42,56,690,29};
        int target=51;
        System.out.println(linearsearch(arr , target, 1, 8));
    }
    //search the target and return the element
    static int linearsearch(int[] arr, int target,int start , int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element==target){
                return index;
            }
                }
                return -1;
            } 
        }

