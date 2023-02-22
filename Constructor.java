class Student{
    private String name;
    private int age;
    Student(){
        System.out.println("Zero Constructor are called");
        name="JIBON";
        age=18;
    }
    Student(String name,int age){
        this();
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    
}
class Constructor{
    public static void main(String[] args) {
        Student obj=new Student("Rizwan", 24);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}