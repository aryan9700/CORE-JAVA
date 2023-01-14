package recursion;

//Olog(n)
public class sumOfDigits {
    public static void main(String[] args) {
        int ans = sumD(145);
        System.out.println(ans);
    }

    static int sumD(int n) {
        if (n == 0) {
            return 0;
        }
        return sumD(n / 10) + (n % 10);

    }
}
