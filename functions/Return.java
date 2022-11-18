package functions;
import java.util.Scanner;
public class Return {
    //return the value
  

    public static void main(String[] args) {
       int answer= sum2();
    }
        static int sum2(){ 
            Scanner in = new Scanner(System.in);
            System.out.println("enter no :1");
            int num1=in.nextInt();
            System.out.println("enter no :2");
            int num2=in.nextInt();
            int sum=num1+num2;
return sum;
//System.out.println("this will never execute");
        }
        
}
