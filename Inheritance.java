class Human{
    int age;
    Human(){
        System.out.println("Human Class Constructor");
    }
    void sleep(){
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student extends Human{
     void disp(){
        System.out.println("The age is: "+age);
     }
}
public class Inheritance {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.sleep();
    }
    
}
