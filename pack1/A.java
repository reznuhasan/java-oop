package pack1;

class A {
  public void m1(){
    System.out.println("A class Method.");
  }  
  private int a;
  public int getA() {
    return a;
   }
   public void setA(int a) {
    this.a = a;
     }
    protected int b=10;

}
class Modifier{
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.b);
    }
}
