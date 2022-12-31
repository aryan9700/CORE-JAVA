import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//here it convert char to there ASCII value then add them
        System.out.println("a"+"b");//here it concatenate the string
        System.out.println('a'+3);//output 100 = d value
        System.out.println((char)('a'+3));//to covert 100 value in character output
        System.out.println("a"+ 1);//when a integer is concatenated with a string it is converted to its 
        //wrapper class integeg
        //this is same as after a few steps:("a"+"1")
        //integer will be converted to Integer that will call toString();

        System.out.println("Kunal" + new ArrayList<>());//here bracket is the capacity of array list
        System.out.println("Kunal" + (56));//new Integer(56)
        //+ //in java has more functionality as it help in operator overloading
        //+ is only defined for primitives or any one of this values is string
        //- operator minus only work for primitives not for Strings
        System.out.println((56) +""+ new ArrayList<>());//atleast one of this objects is of type string
        

    }
}
