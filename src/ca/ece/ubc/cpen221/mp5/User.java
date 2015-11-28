package ca.ece.ubc.cpen221.mp5;

// TODO: Use this class to represent a Yelp user.

public class User {
    
    String url;
    int funny;
    int useful;
    int cool;
    int review_count;
    String type;
    String user_id;
    String name;
    double average_stars;
    
    public User(String url,int funny, int useful, int cool, int review_count,
           String type, String user_id, String name, double average_stars) {
        this.url = url;
        this.funny = funny;
        this.useful = useful;
        this.cool = cool;
        this.review_count = review_count;
        this.type = type;
        this. user_id = user_id;
        this.name = name;
        this.average_stars = average_stars;
        
    }

}
