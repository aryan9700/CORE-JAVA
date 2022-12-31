//package dsa.pattern problems;

public class pattern1 {
    public static void main(String[] args) {
        PatternStar(5);
    }
    static void PatternStar(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
        //when one row is printed we need to add a new line
        System.out.println();
    }}
}

