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
public class Method_Overriding {
    public static void main(String[] args) {
        Cat obj =new Cat();
        obj.disp();
    }
}
