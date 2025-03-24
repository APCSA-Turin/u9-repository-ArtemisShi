package Bestbuy;

public class Computer {
private int screenSize;
private int memory;

public Computer(int screen, int mem){
    screenSize=screen;
    memory=mem;
}
public int getScreenSize() {
    return screenSize;
}

public int getMemory() {
    return memory;
}

public void installOperatingSystem() {
    System.out.println("installing OS...");
}

public void printInfo(){
    System.out.println("Screen Size: "+ screenSize);
    System.out.println("Memory: "+memory);
}
}