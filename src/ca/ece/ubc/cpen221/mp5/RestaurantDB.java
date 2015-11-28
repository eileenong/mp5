package ca.ece.ubc.cpen221.mp5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import java.util.Iterator;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.sun.javafx.scene.paint.GradientUtils.Parser;

// TODO: This class represents the Restaurant Database.
// Define the internal representation and 
// state the rep invariant and the abstraction function.

public class RestaurantDB {
    
    ArrayList<Restaurant> RestaurantList = new ArrayList<Restaurant>();
    ArrayList<User> UserList = new ArrayList<User>();
    ArrayList<Review> ReviewList = new ArrayList<Review>();

	/**
	 * Create a database from the Yelp dataset given the names of three files:
	 * <ul>
	 * <li>One that contains data about the restaurants;</li>
	 * <li>One that contains reviews of the restaurants;</li>
	 * <li>One that contains information about the users that submitted reviews.
	 * </li>
	 * </ul>
	 * The files contain data in JSON format.
	 * 
	 * @param restaurantJSONfilename
	 *            the filename for the restaurant data
	 * @param reviewsJSONfilename
	 *            the filename for the reviews
	 * @param usersJSONfilename
	 *            the filename for the users
	 */
	public RestaurantDB(String restaurantsJSONfilename, String reviewsJSONfilename, String usersJSONfilename) {
		// TODO: Implement this method
        JSONParser parser = new JSONParser();
        FileReader restaurantReader = new FileReader(restaurantsJSONfilename);
        try {
            Object restaurantObj = parser.parse(restaurantReader);
            JSONObject jsonObj = (JSONObject) restaurantObj;
            for( int i = 0; i < jsonObj.size(); i++) {
                boolean open = (boolean) jsonObj.get("open");
                String url = (String) jsonObj.get("url");
                double longitude = (double) jsonObj.get("longitude");
                String[] neighborhoods = (String[]) jsonObj.get("neighborhoods");
                String business_id = (String) jsonObj.get("business_id");
                String name = (String) jsonObj.get("name");
                String[] categories = (String[]) jsonObj.get("categories");
                String state = (String) jsonObj.get("state");
                String type = (String) jsonObj.get("type");
                int stars = (int) jsonObj.get("stars");
                String city = (String) jsonObj.get("city");
                String full_address = (String) jsonObj.get("full_address");
                int review_count = (int) jsonObj.get("review_count");
                String photo_url = (String) jsonObj.get("photo_url");
                String[] schools = (String[]) jsonObj.get("schools");
                double latitude = (double) jsonObj.get("latitude");
                int price = (int) jsonObj.get("price");

                RestaurantList.add(new Restaurant(open, url, longitude, neighborhoods,
                        business_id, name, categories, state, type, stars, city, full_address,
                        review_count, photo_url, schools, latitude, price));
            }
            
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (ParseException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        FileReader userReader = new FileReader(usersJSONfilename);
        Object userObj = parser.parse(userReader);
        JSONObject userJsonObj = (JSONObject) userObj;
        for( int i = 0; i < userJsonObj.size(); i++) {
            String url = (String) userJsonObj.get("url");
            int funny = (int) userJsonObj.get("funny");
            int useful = (int) userJsonObj.get("useful");
            int cool = (int) userJsonObj.get("cool");
            int review_count = (int) userJsonObj.get("review_count");
            String type = (String) userJsonObj.get("type");
            String user_id = (String) userJsonObj.get("user_id");
            String name = (String) userJsonObj.get("name");
            double average_stars = (double) userJsonObj.get("average_stars");
            
            UserList.add(new User(url, funny, useful, cool, review_count, type, user_id, name, average_stars));
        }
        
        FileReader reviewReader = new FileReader(reviewsJSONfilename);
	    Object reviewObj = parser.parse(reviewReader);
	    JSONObject reviewJsonObj = (JSONObject) reviewObj;
	    for( int i = 0; i < reviewJsonObj.size(); i++) {
	        String type = (String) reviewJsonObj.get("type");
	        String review_id = (String) reviewJsonObj.get("review_id");
	        String text = (String) reviewJsonObj.get("text");
	        int stars = (int) reviewJsonObj.get("stars");
	        String user_id = (String) reviewJsonObj.get("user_id");
	        String date = (String) reviewJsonObj.get("date");
	        
	        ReviewList.add(new Review(type, review_id, text, stars, user_id, date));
	    }
	    
        
	}

	public Set<Restaurant> query(String queryString) {
		// TODO: Implement this method
		// Write specs, etc.
		return null;
	}

}
