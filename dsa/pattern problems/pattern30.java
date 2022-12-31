public class pattern30 {
    public static void main(String[] args) {
        PatternStar(4);
    }
    static void PatternStar(int n){
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=row; col++) {
                System.out.print(col);
            }
            
            
        //when one row is printed we need to add a new line
        System.out.println();
 } }
}
