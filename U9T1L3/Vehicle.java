public class Vehicle {
  private String licensePlate;
  private double tollFee;
  private int passengers;
  private boolean windowOpen;
  
  public Vehicle(String licensePlate, double tollFee, int passengers) {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }

  public void setPassengersDown(int pass){
    if(pass<passengers){
    passengers-=pass;
    }
  }

  public void setPassengersUp(int pass){
    passengers+=pass;
  }

  public void setToll(){
    tollFee*=0.5;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public double getTollFee() {
    return tollFee;
  }

  public int getPassengers() {
    return passengers;
  }

  public void closeWindow(){
    windowOpen=false;
    System.out.println("The windows are closed.");
  }

  public void printInfo(){
    System.out.println("license: "+ licensePlate);
    System.out.println("toll fee: "+tollFee);
    System.out.println("passengers: "+passengers);
  }

  public double calculateTollPrice() {
    return tollFee * passengers;
  }
}