import java.util.Scanner;

public class CelsiusToFprogram {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Please enter your temp in celsius");
        float tempC = in.nextFloat();
        float tempF = ((tempC) * 9 / 5) + 32;
System.out.println("So your temp in farenhite is " +(tempF));
 
    }
}
