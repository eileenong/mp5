package ca.ece.ubc.cpen221.mp5;

// TODO: Use this class to represent a restaurant.
// State the rep invariant and abs

public class Restaurant {
    
    boolean open;
    String url;
    double longitude;
    String[] neighborhoods;
    String business_id;
    String name;
    String[] categories;
    String state;
    String type;
    int stars;
    String city;
    String full_address;
    int review_count;
    String photo_url;
    String[] schools;
    double latitude;
    int price;
    
    public Restaurant(boolean open, String url, double longitude, String[] neighborhoods,
            String business_id, String name, String[] categories, String state, String type,
            int stars, String city, String full_address, int review_count, String photo_url,
            String[] schools, double latitude, int price) {
        this.open = open;
        this.url = url;
        this.longitude = longitude;
        this.neighborhoods = neighborhoods;
        this.business_id = business_id;
        this.name = name;
        this.categories = categories;
        this.state = state;
        this.type = type;
        this.stars = stars;
        this.city = city;
        this.full_address = full_address;
        this.review_count = review_count;
        this.photo_url = photo_url;
        this.schools = schools;
        this.latitude = latitude;
        this.price = price;
    }

}
