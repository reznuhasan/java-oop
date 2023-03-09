class M{
    void a()throws Exception{
        b();
    }
    void b() throws Exception{
        int result=8/0;
        System.out.println(result);
    }
}
public class Ducking {
    public static void main(String[] args) {
        M obj=new M();
        try{
            obj.a();
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
