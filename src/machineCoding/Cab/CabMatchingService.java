package machineCoding.Cab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CabMatchingService {

	private static CabMatchingService obj = null;
	
	public ArrayList<Driver> drivers;
	public ArrayList<Passenger> passengers;
	public HashMap<String,User> users;
	
	public static CabMatchingService getInstance() {
		if(obj==null)
			obj = new CabMatchingService();
		
		return obj;
	}
	
	private CabMatchingService(){
		drivers = new ArrayList<Driver>();
		passengers = new ArrayList<Passenger>();
		users = new HashMap<String, User>();
	}
	
	public String getMatch(String passenger_name){
		
		Passenger passenger = (Passenger) getOrCreateUserByName(passenger_name,"passenger");
		
		int index = getDriverIndexWithRatingMoreThan(passenger.getRating());
		
		if(index==-1)
			index=drivers.size()-1;
		
		while(index<drivers.size() && passenger.getBlacklist().contains(drivers.get(index)))
				index++;
		
		if(index==drivers.size())
			index--;
		
		while(index>=0 && passenger.getBlacklist().contains(drivers.get(index)))
				index--;
		
		if(index==-1)
			return "No matching driver";
		

		return drivers.get(index).getName();
	}
	
	private int getDriverIndexWithRatingMoreThan(double rating) {
		int index = -1;
		
		int b=0,e=drivers.size()-1;
		
		while(e>b) {
			int mid = (b+e)/2;
			if(drivers.get(mid).getRating()>=rating) {
				index=mid;
				e=mid-1;
			}
			else {
				b=mid+1;
			}
				
		}
		
		return index;
	}

	public void addRide(String passenger_name, int passenger_ranting, String driver_name, int driver_rating){
		
		Passenger passenger = (Passenger) getOrCreateUserByName(passenger_name,"passenger");
		Driver driver = (Driver) getOrCreateUserByName(driver_name,"driver");
		passenger.addRating(passenger_ranting,driver);
		driver.addRating(driver_rating,passenger);
		Collections.sort(passengers,(a,b)->(int)(a.getRating()-b.getRating()));
		Collections.sort(drivers,(a,b)->(int)(a.getRating()-b.getRating()));
	}
	
	private User getOrCreateUserByName(String name, String type) {
		
		User user_ob = null;
		
		if(type.contentEquals("passenger")) {
			if(users.containsKey(name))
				user_ob = users.get(name);
			else {
				 user_ob = new Passenger(name);
				 users.put(name, user_ob);
				 passengers.add((Passenger) user_ob);
			}			
		}
		else if(type.contentEquals("driver")) {
			if(users.containsKey(name))
				user_ob = users.get(name);
			else {
				 user_ob = new Driver(name);
				 users.put(name, user_ob);
				 drivers.add((Driver) user_ob);
			}
		}
		
		return user_ob;
	}

	
	
	
	
}
