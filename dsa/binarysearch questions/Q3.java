//Q3. Find Smallest Letter Greater Than Target
//Return the smallest character in letters that is lexicographically greater than target.
//If such a character does not exist, return the first character in letters.
/*Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0]
 
1.answer we use same approach used in ceiling in binary searh
2.ignore the target = what we are looking for
3.arr=['c','d','f','j']; target='j'
condition violated start=end+1=> length of array = N
4.return start%N ; 2%4 = 2 ; 4%4 = 0 return to start
if start==N;
return 0
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
*/
public class Q3 {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'h', 'j' };// sorted
        char target = 'j';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);

    }

    // return the index of smallest no. >= target
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle element
            // (s+e)/2 may exceed the int range if it is large value, so mid = start +
            // {(end-start)/2}
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

}
