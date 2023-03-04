class A{
    public void m1(){
        System.out.println("Parent Class");
    }
}
class B extends A{
    public void m2(){
        System.out.println("Child Class");
    }
}
class C{
    public void poly(A ref){
        ref.m1();
    }
}
public class InheritanceTest {
   public static void main(String[] args) {
        B p=new B();
        C c=new C();
        c.poly(p);
   } 
}
