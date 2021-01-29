package machineCoding.Cab;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		
		CabMatchingService s = CabMatchingService.getInstance();
		
		s.addRide("ram", 3, "bheem", 5);
		s.addRide("laxman", 5, "nakul", 2);
		s.addRide("ram", 4, "sahadev", 2);
		s.addRide("bharat", 3, "bheem", 5);
		s.addRide("ram", 4, "bheem", 1);
		s.addRide("laxman", 5, "sahadev", 3);
		s.addRide("bharat", 5, "nakul", 5);
		
		for(Passenger p : s.passengers) {
			System.out.println(p);
		}
		
		for(Driver d : s.drivers) {
			System.out.println(d);
		}
		
		System.out.println(s.getMatch("ram"));
		System.out.println(s.getMatch("laxman"));
	}
}
