class Animal{
    void disp(){
        System.out.println("This method for all class");
    }
    void eat(){
        System.out.println("Animal eating");
    }
}
class Cat extends Animal{
   void eat(){
    System.out.println("Cat eating");
   }

}
class Tiger extends Animal{
    void eat(){
        System.out.println("Tiget eating");
    }
}
class Monkey extends Animal{
    void eat(){
        System.out.println("Monkey eating");
    }
}
public class Hirarchical {
    public static void main(String[] args) {
        Monkey m=new Monkey();
        Cat c=new Cat();
        Tiger t=new Tiger();
        m.eat();
        c.eat();
        t.eat();
    }
    
}
