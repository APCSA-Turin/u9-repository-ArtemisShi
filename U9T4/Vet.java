package U9T4;

import java.util.ArrayList;

public class Vet {
    private String vetName;
    private ArrayList<Animal> clients;

    public Vet(String name){
        vetName=name;
        clients=new ArrayList();
    }

public boolean addClient(Animal an){
    boolean check=true;
    if(clients.size()>0){
    for(Animal a: clients){
        if(a.equals(an)){
            check=false;
        }
    }
}
if(check==false){
    System.out.println(an.getName()+" is already a client of "+vetName);
    return false;
}
else{
    clients.add(an);
    System.out.println("Welcome to "+ vetName +"'s office, "+an.getName());
    return true;
}
}

public void printClientList(){
    for(Animal an: clients){
        System.out.println(an.getName()+" "+an.getClass());
    }
}
}
