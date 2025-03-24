
public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }

    @Override
    public double calculateTollPrice(){
      if(getPassengers()<4){
        return super.calculateTollPrice();
      }
      else{
return getTollFee()*4;
      }
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

    @Override
    public void  printInfo(){
      super.printInfo();
System.out.println("Electric? "+isElectric() );
System.out.println("Discounted? "+ isDiscountApplied());
    }
  }