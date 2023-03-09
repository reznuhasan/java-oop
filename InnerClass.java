class Car{
    class Engine{
        public void m1(){
            System.out.println("This is inner class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Car c=new Car();
        Car.Engine eng=c.new Engine();
        eng.m1();
    }
}
