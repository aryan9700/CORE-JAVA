import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        String name = input.nextLine();
       // for int 
       // System.out.println(input); or System.out.println(input.nextInt());
        //for string
        // System.out.println(input.next());
        // for string full line 
        System.out.println("how r u bro "+ name);
    }
}

