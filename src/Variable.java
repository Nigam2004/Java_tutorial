public class Variable {
    int a=10;//instance Variable(the variable which declared before all the method and inside the class)
     static double b=20.3;//static variable
    public static void main(String[] args) {
        boolean c=true;//local variable
        Variable s=new Variable();
      System.out.println(s.a+" "+b+" "+c);
    }
}
