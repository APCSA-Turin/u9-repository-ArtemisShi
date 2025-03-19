package Shelter;

public class Dog extends Animal {
    private String dogBreed;
    private boolean hasBeenWalked=false;

    public Dog(String sex, boolean owned, boolean hungry, String name, int age, boolean ifVax, String breed){
        super(sex, owned, hungry, name, age, ifVax);
        this.dogBreed=breed;
    }

    public String getBreed(){
        return dogBreed;
    }
    public boolean ifWalked(){
        return hasBeenWalked;
    }

    public void dogInfo(){
        System.out.println(getName()+" is a "+getAge()+" " +getSex()+" "+ getBreed()+".");
    }

    public void walk(){
        System.out.println("We are taking "+ getName()+ " out for a walk!");
        hasBeenWalked=true;
    }
}
