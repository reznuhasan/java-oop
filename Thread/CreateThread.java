

class MyThread extends Thread{
   
    public void run(){
        System.out.println("child thread");
    }
}
public class CreateThread {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        MyThread obj =new MyThread();
        obj.start();
        
    }
}
