import java.lang.Math;
class Employee{
     private AccountNo acc;
     private double accNo;
     public Employee(AccountNo acc){
        this.acc=acc;
     }
     public void setEmployeeAccountNo(){
        accNo=acc.giveAccountNo();
     }
     public void getEmployeeAccountNo(){
        System.out.println("This Employee AccountNo "+accNo*10000);
     }
}
class AccountNo{
    public double giveAccountNo(){
        double rand=Math.random();
        
        return rand;
    }
}
public class HasA2 {
    public static void main(String[] args) {
        AccountNo a=new AccountNo();
        Employee emp=new Employee(a);
        emp.setEmployeeAccountNo();
        emp.getEmployeeAccountNo();

    }
}
