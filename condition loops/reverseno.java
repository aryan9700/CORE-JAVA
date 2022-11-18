import javax.sound.sampled.SourceDataLine;

public class reverseno {
    public static void main(String[] args) {
        int num = 4432567;
        int rev=0;
        while (num>0){
            int rem = num%10;
            num=num/10;// num/=10;
            
        rev =rev*10+rem;
            
        }
         System.out.println(rev);
    } 
}
