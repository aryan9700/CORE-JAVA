package VarArgs;//variable length arguments=when we dont know  how many input we are giving

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,4,6,7,3,8,9);//any number we want
        multiple(34,56,"kunal", "aryan", "hawk");
        
    }
    static void multiple(int a, int b, String...v)//rule:variable parameter will be last in this list 
    {
        System.out.println(Arrays.toString(v));
    }
    static void fun(int...v)//any name String...d=array of string,char...a = array of char 
    {System.out.println(Arrays.toString(v));

    }
}
