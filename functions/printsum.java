package functions;

import java.util.Scanner;

public class printsum {
    //print sum of two no. input from user
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("enter no :1");
        int num1=in.nextInt();
        System.out.println("enter no :2");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("the sum of this two no is :"+sum);
        
}}
