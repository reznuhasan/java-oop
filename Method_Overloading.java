import java.util.Scanner;

public class Method_Overloading {
    public static int add(){
        return 3+7;
    }
    public static int add(int a){
        return a+10;
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(add());
        System.out.print("Enter your a value:");
        int a=in.nextInt();
        System.out.println(add(a));
        System.out.print("Enter your b value:");
        int b=in.nextInt();
        System.out.println(add(a,b));
    }
}
