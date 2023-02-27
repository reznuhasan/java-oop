class Car{
    private Engine eg;
    Car(Engine eg){
        this.eg=eg;
    }
   public void start(){
      if(eg.check()==true){
        System.out.println("Car is start");
      }
   }

}
class Engine{
    public boolean check(){
        return true;
    }
}
public class HasA1 {
    public static void main(String[] args) {
        Engine engine=new Engine();
        Car c=new Car(engine);
        c.start();
    }
}
