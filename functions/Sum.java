package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
        static void sum(){ 
            Scanner in = new Scanner(System.in);
            System.out.print("enter no :1");
            int num1=in.nextInt();
            System.out.print("enter no :2");
            int num2=in.nextInt();
            int sum=num1+num2;
            System.out.println("the sum of this two no is :"+sum);

        }
        
        /*
         access modifier (oops) return_type name(){
            //body
            return statement;
         }
         */
    }
