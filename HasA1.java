class Car{
    private Engine eg;
    Car(Engine eg){
        this.eg=eg;
    }
   public void setEg(Engine eg){
    this.eg=eg;
   }
   public void start(){
     eg.EngineStart();
   }

}
class Engine{
    public void EngineStart(){
        System.out.println("Car is Start");
    }
}
public class HasA1 {
    public static void main(String[] args) {
        Engine engine=new Engine();
        Car c=new Car(engine);
        c.start();
    }
}
