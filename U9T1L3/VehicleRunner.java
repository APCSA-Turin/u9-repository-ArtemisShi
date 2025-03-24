
public class VehicleRunner {
    
        public static void main(String[] args) {
          Vehicle v= new Vehicle("BGUYDT241", 2, 2);
          Truck T= new Truck("SFAF#532", 0, 0, 0, false);
          Car c= new Car(null, 0, 0, false);
          Taxi t = new Taxi(null, 0, 0, false, 0);

          v.closeWindow();
          T.closeWindow();
          c.closeWindow();
          t.closeWindow();
          
          
    }
}