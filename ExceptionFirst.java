import java.util.Scanner;

public class ExceptionFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number:");
        int num1=sc.nextInt();
        System.out.print("Enter your second number:");
        int num2=sc.nextInt();
        int result=0;
        try{
           result=num1/num2;
        }catch(Exception obj){
            System.out.println("Something Wrong");
        }
        System.out.println("The result is "+result);
    }
}
