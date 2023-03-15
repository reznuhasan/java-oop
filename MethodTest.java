public class MethodTest {
    public void m1(int a){
        System.out.println("int type");
    }
    public void m1(float a){
        System.out.println("float type");
    }
    public void m1(double a){
        System.out.println("double type");
    }
    public static void main(String[] args) {
       MethodTest obj=new MethodTest();
       obj.m1(12);
       obj.m1(12.345f);
       obj.m1(10l);
       obj.m1('a');
       obj.m1(245.66);
    }
   
}
