
//time complexity O(N^2)
public class performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a'+i );
            System.out.println(ch);
            series= series + ch; //series += ch
        }
        System.out.println(series);
    }
    
}
