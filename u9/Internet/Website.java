package Internet;

public class Website {
private String URL;
private int dailyViewers;

public Website(String link, int views){
    URL =link;
    dailyViewers=views;
}

public String getURL(){
    return URL;
}

public int getDailyViewers(){
    return dailyViewers;
}

public void cookies(){
    System.out.println("This website will be collecting cookies from you.");
}


}
