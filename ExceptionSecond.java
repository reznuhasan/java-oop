import java.util.Scanner;

public class ExceptionSecond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        try{
            n=sc.nextInt();
        }catch(Exception obj){
            System.out.println("Something went wrong.");
        }finally{
            sc.close();
        }
    }
}
