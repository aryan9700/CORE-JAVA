package functions;
import java.util.Scanner;

public class namegreet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String naam=in.next();
        String personalized =myGreet(naam);
        System.out.println(personalized);
    }
        static String myGreet(String name) {
            String message = "Hello "+name;
            return message;

            
     
    }
}
