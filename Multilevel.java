import javax.sound.sampled.SourceDataLine;

class Demo1{
    int age=18;
    void sleep(){
        System.out.println("I am sleeping");
    }
}
class Demo2 extends Demo1{
    int mark=18;
    void eat(){
        System.out.println("I am eating");
    }
}
class Demo3 extends Demo2{
    
}
public class Multilevel {
    public static void main(String[] args) {
        Demo3 obj=new Demo3();
        obj.sleep();
        obj.eat();
    }
    
}
