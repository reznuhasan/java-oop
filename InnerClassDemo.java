class D{
    class F{
        public void m1(){
            System.out.println("Inner Class method");
        }
    };
}

public class InnerClassDemo{
    public static void main(String[] args) {
        D objA=new D();
        D.F objB=objA.new F();
        objB.m1();
    }
}