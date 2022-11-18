import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
       int  value=0;
       Scanner in = new Scanner(System.in);
    // take input from user till user doesn't press x or X;

while(true){
    // take operator input((
        System.out.println("enter the operator");
    char op = in.next().trim().charAt(0);
    if(op == '+'|| op =='-'|| op =='/'|| op=='*' || op=='%'){
        // input 2 no.
        System.out.println("enter 2 no");
        int a = in.nextInt();
        int b = in.nextInt();

if (op=='+')
{value=a+b;
}
if (op=='-'){
    value=a-b;
}
if (op=='/'){
    if (b!=0){
    value=a/b;
}}
if (op=='*'){
    value=a*b;
}
if (op=='%'){
    value=a%b;
}}
else if(op=='x'|| op=='X'){
break;}
else{
    System.out.println("invalid operation");}

System.out.println(value);
    }
}




        
    }

