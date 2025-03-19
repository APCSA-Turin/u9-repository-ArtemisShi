
public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }

    

    public boolean dropOffPassengers(int numOut){
      if(numOut<getPassengers()){
      setPassengersDown(numOut);
      return true;
      }
      else{
        return false;
      }
    }

    public void setDiscount(){
      discountApplied=true;
    }

    
    public void applyDiscount(){
      if(isDiscountApplied()==false&&isElectric()){
        setToll();
        discountApplied=true;
      }
    }


  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    public void printCar(){
        System.out.println("License Plate Number: "+getLicensePlate()+"\nPassengers: "+getPassengers()+"\nToll Fee: "+getTollFee()+"\nElectric: "+isElectric()+"\nDiscounted: "+isDiscountApplied());
    }
  }