interface Computer{
    void compileCode();
}
class Laptop implements Computer{
    public void compileCode(){
        System.out.println("You got 5 errors");
    }
}
class Desktop implements Computer{
    public void compileCode(){
        System.out.println("you got 5 errors,faster");
    }
}
class Developer{
    public void buildApp(Computer ref){
        System.out.println("Building App");
        ref.compileCode();
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        Developer dev=new Developer();
        dev.buildApp(desk);
    }
}
