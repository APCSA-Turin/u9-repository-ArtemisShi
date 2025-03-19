
public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    public boolean validateLicensePlate(){
      if(hasTrailer()&&axles>4){
        if(getLicensePlate().substring(getLicensePlate().length()-2,getLicensePlate().length()).equals("MX")){
          return true;
        }
        else{
          return false;
        }
      }
      if(hasTrailer()&&axles<=4){
        if(getLicensePlate().substring(getLicensePlate().length()-2,getLicensePlate().length()).equals("LX")){
          return true;
        }
        else{
          return false;
        }
      }
      return true;

    }


    public void printTruck(){
        System.out.println("License Plate Number: "+getLicensePlate()+"\nPassengers: "+getPassengers()+"\nToll Fee: "+getTollFee()+"\nNumber of Axles: "+getAxles()+"\nTrailer: "+hasTrailer());
    }
  }