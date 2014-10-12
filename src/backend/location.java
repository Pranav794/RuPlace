package backend;

public class location {
	String name;
	String street;
	String city;
	String state;
	String stateabr;
	int zipcode;
	String country;
	double latitude;
	double longitude;
	
	public String toString(){
		String s =
				"BUILDING NAME: " + name
				+"\nStreet: " + street
				+ "\nCity: " + city
				+ "\nState: " + state
				+ "\nState Abr: " + stateabr
				+ "\nLocal Zipcode: " + zipcode
				+ "\nCountry: "+ country
				+ "\nLatitude: " + latitude
				+ "\nLongitude: " + longitude;
		return s;
		
	}
	

}
