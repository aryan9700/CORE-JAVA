//how many time a no. is occuring in series ex- 1,4,6,9,5,8,3,2,4,6,7,9 =9 occur 2 times
public class occurence {
    public static void main(String[] args) {
        int count=0;
        int n =288489087;
        while (n>0){
            int rem = n%10;
            // 288489087%10=7
           if(rem==8){
           count++;
        }
    n=n/10;

    }System.out.println(count);
    }
    
}
