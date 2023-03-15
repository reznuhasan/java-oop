public class LaunchThread{
    public static void main(String[] args) {
        System.out.println("Main Thread");
        System.out.println("Before Changing");
        String name1=Thread.currentThread().getName();
        int num1=Thread.currentThread().getPriority();
        System.out.println(name1);
        System.out.println(num1);
        Thread t=Thread.currentThread();
        t.setName("Rizwan");
        t.setPriority(1);
        System.out.println("After Changing");
        String name2=Thread.currentThread().getName();
        int num2=Thread.currentThread().getPriority();
        System.out.println(name2);
        System.out.println(num2);
    }
}