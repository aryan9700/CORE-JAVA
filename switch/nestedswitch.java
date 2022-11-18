import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        System.out.println("plese enter a no");

        Scanner in =new Scanner(System.in);
        int empId= in.nextInt();

        switch (empId) {
            case 1:
            { System.out.println("aryan yadav");}
            break;
            case 2:{
                System.out.println("varun sao");
            }break;

            case 3:
            switch("management"){
                case "it": {
                    System.out.println("not core");
                }
                break;
                case "cse":{
                    System.out.println("core");
                }break;
                default:{System.out.println("no department");}
               

            } default:{System.out.println("invalid entry");}

        } 
    }
}
