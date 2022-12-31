public class pattern28 {
    public static void main(String[] args) {
        PatternStar(5);
    }
    static void PatternStar(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalcolinrow= row>n ? 2*n-row:row;
            int noofspaces=n-totalcolinrow;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcolinrow; col++) {
                System.out.print("* ");
            }
            
            
        //when one row is printed we need to add a new line
        System.out.println();
 } }
}