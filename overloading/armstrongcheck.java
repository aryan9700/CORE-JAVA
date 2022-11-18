package overloading;

import java.util.Scanner;

public class armstrongcheck {
    //print all the 3 digits armstrong number
    /*
     a=153 3^3=27 5^3=125 1^3=1 27+125+1=153 so armstrong no
     while(a>0){
        rem =a%10;
        cube=rem;
        sum+=cube
     }
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
       // System.out.println(isArmstrong(n));
       for (int i=100; i<1000; i++){
        if (isArmstrong(i)){
            System.out.println(i + " ");
        }

       }
    }
    static boolean  isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem= n%10;
            n=n/10;
            sum=sum+ rem*rem*rem;

        }
        if (sum==original){
            return true;
        }
        return false;
    }
}
