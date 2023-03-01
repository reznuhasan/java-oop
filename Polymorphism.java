class Animal{
    public void disp(){
        System.out.println("It's Animal Class");
    }
}
class Cat extends Animal{
    public void disp(){
        System.out.println("It's Cat Class");
    }
}
class Dog extends Animal{
    public void disp(){
        System.out.println("It's Dog Class");
    }
}
class Tiger extends Animal{
    public void disp(){
        System.out.println("It's Tiger Class");
    }
}
// polymorphism class
class Forest{
    // polymorphism method
    public void poly(Animal ref){
        ref.disp();

        System.out.println("**************************************");
    }
}
public class Polymorphism{
    public static void main(String args[]){
        Dog d=new Dog();
        Cat c=new Cat();
        Tiger t=new Tiger();

        Forest f=new Forest();
        f.poly(t);
        f.poly(c);
        f.poly(d);
    }
}