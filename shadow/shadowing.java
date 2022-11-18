package shadow;
public class shadowing {
    static int x=90;//this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); //90
        int x;//declaring // the class variable at line 3 is shadowed by this
        // System.out.println(x); = error because scope will begin when value is initialised
        x=40;//initializing
        System.out.println(x);//40
        fun();
    }
    static void fun(){
    System.out.println(x);
}
}
