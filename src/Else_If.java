import java.util.Scanner;

public class Else_If {
    public static void main(String[] args) {
        int mark;
        System.out.println("enter your mark: ");
        Scanner obj=new Scanner(System.in);
        mark=obj.nextInt();
        if(mark>=60 && mark<100)
        {
            System.out.println("1st division");
        } else if (mark>=45 && mark<60) {
            System.out.println("2nd division");
        } else if (mark>=33 && mark<45){
            System.out.println("3rd division");
        }
        else {
            System.out.println("congratulation u are faild");
        }
    }
}
