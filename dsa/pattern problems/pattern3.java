//package dsa.pattern problems;
//note try to find formula relating rows and columns
public class pattern3 {
    public static void main(String[] args) {
        PatternStar(5);
    }
    static void PatternStar(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("* ");
            }
        //when one row is printed we need to add a new line
        System.out.println();
    }}
}
