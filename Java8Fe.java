interface A{
    void show();
    default void abc()
    {
      System.out.println("in abc");
    }
    static void config(){
       System.out.println("in config");
    }
}
public class Java8Fe {
    public static void main(String[] args) {
        A.config();
    }
}
