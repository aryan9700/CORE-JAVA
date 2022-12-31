/*Q.Find Nth fibonacci No.
0th 1st 2nd 3rd 4th 5th 6th 7th 8th 9th 10th....
0   1   1   2   3   5   8   13  21  34  55.....
fibo(N)=fibo(N-1)+fibo(N-2)==this is known as recurrence relation(formula)  hence apply recursion  
break it down into smaller problems
the base condition is represented by answer we already have
in this we know that f(0)=0, f(1)=1 this is base condition
how to understand and approach a problem..
A.identify if you can breakdown problem into smaller problems
B.write the recurrence relation if needed
C.draw the recursive tree
About the tree..
1.see the flow of function how they are getting in stack
2.identify and focus on left tree calls and write tree calls
3.draw the tree and pointer again and again using pen and paper
4.use a debbugger to see the flow
5.see how the values are return at each steps
6.see where the functon call will come out of..
7. in the end you will come out of the main function.
*/

public class fabonaccino {
    public static void main(String[] args) {
        int ans=fibo(4);
    System.out.println(ans);
    }
    
    
    static int fibo(int n){
        //base condition
        if (n<2) {
            return n;
        }
        return(fibo(n-1) +  fibo(n-2));
    }
}
