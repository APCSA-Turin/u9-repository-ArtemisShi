package Internet;

public class NewYorkTimes extends Website {
private static int subscriptions;
private final String name = "New York Times";

public NewYorkTimes(String link, int views, int subs){
super(link, views);
subscriptions+=subs;
}

public void welcome(){
    System.out.println("Welcome to the " + name+ "! To view this article you must buy a subscription.");
}

public int getSubscriptions(){
    return subscriptions;
}

public void subBought(){
    subscriptions++;
System.out.println("Thanks for buying a subscription to the NewYorkTimes!");
}
    
}