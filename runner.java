import U9T4.Dog;

import java.util.ArrayList;

import U9T4.Animal;
import U9T4.Cow;
import U9T4.Puppy;
import U9T4.Vet;

public class runner {
   public static void main(String[] args) {
    Animal animal = new Animal("Thing");
    Puppy puppy = new Puppy("Spot");
    Cow cow = new Cow("Marge");
    Dog dog = new Dog("Penny");
    
    Vet vet = new Vet("Turin");
    System.out.println("----> Adding each client (successful):");
    System.out.println(vet.addClient(animal));
    System.out.println(vet.addClient(puppy));
    System.out.println(vet.addClient(cow));
    System.out.println(vet.addClient(dog));
    System.out.println("----> Adding each client again (unsuccessful):");
    System.out.println(vet.addClient(animal));
    System.out.println(vet.addClient(puppy));
    System.out.println(vet.addClient(cow));
    System.out.println(vet.addClient(dog));
    System.out.println("----------> PRINTING CLIENT LIST <----------");
    vet.printClientList();
    
}
}
