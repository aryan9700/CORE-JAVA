import java.util.Scanner;

public class largestnoyt{
    public static void main(String[] args) {
        System.out.println("please enter 3 no.");
        Scanner in =new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        // by formula 
         int max= Math.max(c,(Math.max(a, b)));
        //find the largest no of three no.

     /*   int max = a;
       if (b>max){
        max=b;
    }
    if (c>max){
        max=c;
    }*/
    System.out.println(max);}}
