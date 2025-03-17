package vehicles;
public class Train extends Vehicle {
    int carts;

    public Train(String name, int wheels, int carts){
        super(name, wheels);
        this.carts=carts;
    }

    public int getCarts(){
        return carts;
    }

    public void announceStop(String stop){
        System.out.println("We've arrived at " +stop+ ". ");
    }

    public void announceDelay(){
        System.out.println("Sorry passangers but we have a delay.");
    }
}
