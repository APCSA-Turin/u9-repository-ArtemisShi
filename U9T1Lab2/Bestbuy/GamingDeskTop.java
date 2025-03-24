package Bestbuy;

public class GamingDeskTop extends Desktop{
private String graphicsCard;

public GamingDeskTop(int screenSize, int memory, boolean monitorIncluded, String graphics){
super(screenSize, memory, true);
graphicsCard=graphics;
}

public String getGraphicsCard(){
    return graphicsCard;
}

public void updateGraphics(String newC){
graphicsCard=newC;
}

    
}
