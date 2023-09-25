import java.util.Scanner;

public class InpOutput {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter two number..");//System.out.print() is used for output
        Scanner s=new Scanner(System.in);//Scanner is used for Input
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("the result is:"+c);
    }
}
