
package Shelter;

public class Cat extends Animal {
    private String catBreed;
    private boolean hasPlayedWith=false;

    public Cat(String sex, boolean owned, boolean hungry, String name, int age, boolean ifVax, String breed){
        super(sex, owned, hungry, name, age, ifVax);
        catBreed=breed;
    }

    public String getBreed(){
        return catBreed;
    }
    public boolean ifPlayed(){
        return hasPlayedWith;
    }

    public void catInfo(){
        System.out.println(getName()+" is a "+getAge()+" "+getSex()+" "+ getBreed()+".");
    }

    public void play(){
        System.out.println("Let's play with "+ getName()+ " today!");
        hasPlayedWith=true;
    }

}
