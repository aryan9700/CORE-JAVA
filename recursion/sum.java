package recursion;

public class sum {
    public static void main(String[] args) {
        int ans = sumofall(5);
        System.out.println(ans);
    }

    static int sumofall(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sumofall(n - 1);
    }
}
