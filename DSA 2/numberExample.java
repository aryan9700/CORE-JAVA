//vvi
/*
1.While the function is not finished executing it will remain in stack
2.when a function is finished its executing it is removed from stack and the flow of program
 is restored to where the function was called.
3.Main function go first in stack and also leave stack last 
flow of program remove 1 by 1 from stack
*/ 
public class numberExample {
    public static void main(String[] args) {
        //write a function that take in a number and print it
        //print first 5 numbers: 1 2 3 4 5
        print1(1);
    }
static void print1(int n){
    System.out.println(n);
    print2(2);
}
static void print2(int n){
    System.out.println(n);
    print3(3);
}
static void print3(int n){
    System.out.println(n);
    print4(4);
}
static void print4(int n){
    System.out.println(n);
    print5(5);
}
//function body here changes print call prnt call but here only print
static void print5(int n){
    System.out.println(n);
}
}