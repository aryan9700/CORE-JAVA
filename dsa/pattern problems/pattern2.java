/*how to approach?                      |*----cols
step 1. no. of lines = no. of rows      |**
=no.of times outer loop will run        |***
                                    rows|****
step 2. indetify for every row no.,
*how many cols are there
*types of element in cols
step 3. what do you need to print
*/
public class pattern2 {
    public static void main(String[] args){
PatternStar(4);
    } 
    static void PatternStar(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
        //when one row is printed we need to add a new line
        System.out.println();
    }}
}
