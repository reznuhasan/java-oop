class MyException extends Exception{
    public MyException(){}
    public MyException(String msg){
        super(msg);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int num1=10;
        int num2=-2;
        int result=0;
        try{
           if(num2<0){
            Exception e=new MyException("Negative Number");
            throw e;
           }else{
            result=num1/num2;
           }
        }catch(Exception e){
            System.out.println("Enter a valid number:"+e);
        }
        System.out.println(result);
    }
}
