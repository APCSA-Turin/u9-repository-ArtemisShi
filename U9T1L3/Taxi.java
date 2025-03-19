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

    public void printTaxi(){
        System.out.println("License Plate Number: "+getLicensePlate()+"\nPassengers: "+getPassengers()+"\nToll Fee: "+getTollFee()+"\nElectric: "+isElectric()+"\nDiscounted: "+isDiscountApplied()+"\nTotal Fare Collected: "+getFareCollected());
    }
}
