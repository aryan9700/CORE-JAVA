package recursion;

//n-- vs --n (subtract first then pass)         both are n=n-1;
public class concept {
    public static void main(String[] args) {
        sub(5);
    }

    static void sub(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        sub(--n);
    }
}
