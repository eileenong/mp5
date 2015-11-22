package ca.ece.ubc.cpen221.mp5;

// TODO: Implement a server that will instantiate a database, 
// process queries concurrently, etc.

public class RestaurantDBServer {
    
    int port;
    String restaurantDetails;
    String review;
    String userDetails;

	/**
	 * Constructor
	 * 
	 * @param port
	 * @param filename1
	 * @param filename2
	 * @param filename3
	 */
	public RestaurantDBServer(int port, String filename1, String filename2, String filename3) {
		// TODO: See the problem statement for what the arguments are.
		// TODO: Rename the arguments suitably.
	    this.port = port;
	    this.restaurantDetails = filename1;
	    this.review = filename2;
	    this.userDetails = filename3;
	}

}
