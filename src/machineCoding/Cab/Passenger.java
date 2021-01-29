package machineCoding.Cab;

import java.util.HashSet;

public class Passenger extends User {

	public Passenger(String name){
		this.name = name;
		this.rating = 0;
		this.ride_count = 0;
		this.blacklist = new HashSet<User>();
	}
	
}
