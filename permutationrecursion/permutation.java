import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
       // Permutation("", "abc");
     //  ArrayList <String> ans = PermutationList("", "abc");
      //  System.out.println(ans);
      System.out.println(PermutationCount("", "abc"));
    }
    static void Permutation (String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
            Permutation(f+ch+s,up.substring(1));
        }

    }
    static ArrayList<String> PermutationList (String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans =new ArrayList<>();

        for (int i = 0; i <= p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
           ans.addAll(PermutationList(f+ch+s,up.substring(1)));
        }
        return ans;

    }
    static int PermutationCount (String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
          count= count + PermutationCount(f+ch+s,up.substring(1));
        }
        return count;
    }
    
    
}
