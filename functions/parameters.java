package functions;

public class parameters {
   public static void main(String[] args) {
    int ans = sum3(11,12);
    System.out.println(ans);
   }
   //pass the value of no when you are calling the method in main()
   static int sum3(int a, int b){
    int sum = a+b;
    return sum;
   }
}
