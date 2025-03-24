public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fare){
        super(licensePlate, tollFee, passengers, electric);
        fareCollected=fare;
    }

    public double getFareCollected(){
        return fareCollected;
    }

    public void pickupRiders(int numRiders, double farePerRider){
        setPassengersUp(numRiders);
        fareCollected+=numRiders*farePerRider;
        if(isDiscountApplied()==false){
            if(isElectric()||getPassengers()>=4){
                setToll();
                setDiscount();
            }
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider){

    for(int i=0;i<getPassengers()-1;i++){
        fareCollected+=farePerRider;
    }
        return dropOffPassengers(getPassengers()-1);

    }

    @Override
    public void closeWindow(){
super.closeWindow();
        System.out.println("The screen divider is closed.");
    }


    @Override
    public void  printInfo(){
      super.printInfo();
      System.out.println("Fare collected: "+ fareCollected);
    }
}
