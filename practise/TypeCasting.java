public class TypeCasting {
    public static void main(String[] args) {
        //typecasting float to int 
       // int num = (int)(63.67f);
        // System.out.println(num);
     
        // automatic type promotion in expressions
        // int a = 290;
        // byte b = (byte)(a); //byte contain maximum 256 so (290 % 256 = 34)

        //byte b=50;
        //b=b*2; [error] because b is not a int is a byte so how would it perform a integer operation.

        byte a=50;
        byte b=70;
        byte c=90;
        int d = a*b/c;


System.out.println(d);
    }
}
