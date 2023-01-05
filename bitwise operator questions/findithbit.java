public class findithbit {
    public static void main(String[] args) {
        int n=17;
 System.out.println(ithbit(n));
    }
    public static int ithbit(int n){
        return n & (1<<(n-1));
    }
}
