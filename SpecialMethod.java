public class SpecialMethod {
    public void m1(int i){
        System.out.println("General Method");
    }
    public void m1(int... i){
        System.out.println("Var -arg");
    }
    public static void main(String[] args) {
        SpecialMethod t=new SpecialMethod();
        t.m1();

    }
}
