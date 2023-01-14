package recursion;

public class digitProduct {
    public static void main(String[] args) {
        int ans = sumD(1352);
        System.out.println(ans);
    }

    static int sumD(int n) {
        if (n % 10 == n) {
            return n;
        }
        return sumD(n / 10) * (n % 10);

    }
}
