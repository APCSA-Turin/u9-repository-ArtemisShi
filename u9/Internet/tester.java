package Internet;

public class tester {
    public static void main(String[] args) {
        
    
    Website web = new Website("https://www.example.net/^", 12);
    web.getURL();
    web.getDailyViewers();
    web.cookies();

    NewYorkTimes ny = new NewYorkTimes("https://www.nytimes.com/", 1324141, 2432);
    ny.getURL();
    ny.getDailyViewers();
    ny.cookies();
    ny.getSubscriptions();
    ny.welcome();
    ny.subBought();

YouAreAnIdiot you = new YouAreAnIdiot("http://www.YOUAREANID0IT.com/", 13123, 21, 28164761);
you.getURL();
you.getDailyViewers();
you.cookies();
you.getCreditCard();
you.getSeconds();
you.mock();

}
}