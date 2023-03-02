interface Car{
    void drive(int avg);
}
// class WagonR implements Car{
//     public void drive(){
//         System.out.println("Driving..");
//     }
// }
public class AICDemo {
    public static void main(String[] args) {
        Car obj= (avg)->{
            System.out.println("Driving...."+avg);
        };
        obj.drive(16);
    }
}
