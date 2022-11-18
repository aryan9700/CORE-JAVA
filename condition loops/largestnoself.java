import java.util.Scanner;

public class largestnoself {
    public static void main(String[] args) {
        System.out.println("please enter 3 no.");
        Scanner in =new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        if ( a>=b && a>=c){
            System.out.println("a is largest no");}
            else if (b>=c && b>=a){
                System.out.println(" b is the largest no");}
                else{System.out.println("c is the largest no");
            }
        }
    }
         

        

    