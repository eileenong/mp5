package ca.ece.ubc.cpen221.mp5;

// TODO: Use this class to represent a Yelp review.

public class Review {
    
    String type;
    String review_id;
    String text;
    int stars;
    String user_id;
    String date;
    
    public Review(String type, String review_id, String text, int stars, String user_id, String date) {
        this.type = type;
        this.review_id = review_id;
        this.text = text;
        this.user_id = user_id;
        this.date = date;
    }

}
