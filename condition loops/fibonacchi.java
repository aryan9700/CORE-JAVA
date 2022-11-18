import java.util.Scanner;

//find nth faboncci no if n=7  =13
public class fibonacchi{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0;
        int b=1;
        int count = 2;
         
        while(count<=n){
            int temp = b;
            b=b+a;
            a=temp;
            count++;
           
            System.out.println(b);

        }
        // fibonahci no. 0,1,1,2,3,5,8,13...
    }
}