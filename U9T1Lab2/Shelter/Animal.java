package Shelter;

public class Animal {
  private String sex;
  private boolean owned;
  private boolean hungry;
  private String name;
  private int age;
  private boolean vaccinated;

  public Animal(String sex, boolean owned, boolean hungry, String name, int age, boolean ifVax){
    this.sex=sex;
    this.owned=owned;
    this.hungry=hungry;
    this.name=name;
        this.age=age;
        vaccinated=ifVax;
  }

  public String getSex(){
    return sex;
  }
  public boolean getIfOwned(){
    return owned;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public boolean getIfVaxed(){
    return vaccinated;
  }

  public void feed(){
    if(hungry==true){
        System.out.println(name+" is hungry!");
    }
    hungry=false;
    System.out.println(name +" has just been fed!");
  }

  public void adopt(){
    if(owned==false){
        System.out.println(name +" is a stray.");
    }
    owned=true;
    System.out.println(name +" has just been adopted!");
  }

  public void info(){
    System.out.println("Name: "+ name+"/nGender: "+sex+"/nAge: "+age+"/nIs Vaccinated: "+vaccinated);
  }


}
