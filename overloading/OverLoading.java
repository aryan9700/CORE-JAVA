package overloading;

public class OverLoading //funtion overloading at compile time
{
    public static void main(String[] args) {
        fun(67);//call first one
        fun("hawk");//call second one
    }
    //two or more function with same name can exist if the parameters are different
    static void fun(int a){

    }
    static void fun(String name){
        System.out.println(name);

    }
}
