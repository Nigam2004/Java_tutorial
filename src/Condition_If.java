import java.util.Scanner;

public class Condition_If {
    public static void main(String[] args) {
        int pwd;
        System.out.print("enter password:");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if (pwd==123){
            System.out.println("hey I am Nigam ");
        }else {
            System.out.println("Opps password is wrong");
        }
    }
}
