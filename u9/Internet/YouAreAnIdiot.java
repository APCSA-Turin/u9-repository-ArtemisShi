package Internet;

public class YouAreAnIdiot extends Website {
private int seconds;
private int creditCardNumber;
private final String name = "You Are An Idiot";

    public YouAreAnIdiot(String Link, int views, int second, int cred){
        super(Link, views);
        seconds=second;
        creditCardNumber=cred;
    }

    public int getCreditCard(){
        return creditCardNumber;
    }

    public int getSeconds(){
        return seconds;
    }

    public void mock(){
        System.out.println(name+"! You've been on this website for "+ seconds+ "seconds." +" Also, we stole you credit card number.");
    }
    
}
