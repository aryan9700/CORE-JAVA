/*Recursion function for the same 
 * 1.base condition- where our function is stop executing
 * 2.//recursive call
 * if you are calling a function again and again you can treat it as a separate call in stack
 * its same function that is call again and again but every function is taking the memory
 * no base condition=> function call will keep happening stack will be filled again and again each function
 *  take memory 
 * every call of function will take some memory
 * ..memory of computer will exceed of limit --> stack overflow error
 * What is recursion?
 * function calling itself
 * Why we need recursion?
 * it help us solving bigger/complex problems in a simpler way
 * you can covert any recursion solution into iteration{not using any function calls/loops} and viceversa
 * space complexity is not constant because of recursive calls
 * note-                         
           program over <----     <-        <-        <-        <-        <-
 * visualising recursion -- main()->print(1)->print(2)->print(3)->print(4)->print(5)//recursive tree
                            program start
 */
public class recursionEx {
    public static void main(String[] args) {
        print(1);
    }
    
    static void print(int n){
        //base condition
    if( n==5 ){
        System.out.println(5);
        return;
    }
        System.out.println(n);
        //recusive call

        //this is called tail recursion
        //this is the last function call
        print(n + 1);
    }
}
