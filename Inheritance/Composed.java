package Inheritance;
class Student1{
    private Heart1 h;
    public Student1(Heart1 h){
        this.h=h;
    }
    public void call(){
        h.heartBeat();
    }
}
class Heart1{
  public void heartBeat(){
        System.out.println("Heart is important");;
   } 
   public void target(){
    System.out.println("afdfdsf");
   }
}
public class Composed{
    public static void main(String[] args) {
        Heart1 h=new Heart1();
        Student1 s=new Student1(h);
        s.call();
    }
}
