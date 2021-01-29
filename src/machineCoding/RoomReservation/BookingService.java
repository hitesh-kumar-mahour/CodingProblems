package machineCoding.RoomReservation;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class BookingService {
	
	private int ROOMS = 3;
	private int FLOORS = 2;
	private int BUILDINGS = 1;
	
	private static BookingService obj = null;
	
	public HashSet<Booking> bookings;
	
	private BookingService() {
		this.bookings = new HashSet<Booking>();
	}
	
	public static BookingService getInstance() {
		if(obj==null)
			obj = new BookingService();
		
		return obj;
	}
	
	public void book(Room room, TimeDuration duration, Person person ) {
		
		Booking b = new Booking(room, duration, person);
		for(Booking booking : bookings) {
			if(booking.getRoom().equals(room)  && booking.getDuration().overlaps(duration)) {
				System.out.println("Room not idle for requested duration :"+b);
				return;
			}
				
		}
		
		bookings.add(b);
		System.out.println("Room booked :"+b);
	}
	
	public void unbook(Room room, TimeDuration duration, Person person  ) {
		Booking b = new Booking(room, duration, person);
		if(bookings.contains(b)) {
			bookings.remove(b);
			System.out.println("Room unbooked :"+b);
		}
		else
			System.out.println("Booking not present :"+b);
	}
	
	
	public ArrayList<Booking> getSummary(Room r, TimeDuration t){
		
		ArrayList<Booking> ans = new ArrayList<Booking>();
		
		for(Booking booking : bookings) {
			if(booking.getRoom().equals(r) && booking.getDuration().overlaps(t))
				ans.add(booking);
		}
		
		Collections.sort(ans,(b1,b2)->b1.duration.getStart()-b2.duration.getStart());
		
		return ans;
	}
	
	public HashSet<Room> suggestRooms(TimeDuration t, String query) {

		HashSet<Room>available_rooms = new HashSet<Room>();
		if(query==null || query=="") {
			for(int i=1;i<=BUILDINGS;i++)
				for(int j=1;j<=FLOORS;j++)
					for(int k=1;k<=ROOMS;k++)
						available_rooms.add(new Room(k, j, i));
			
		}
		else if(query.startsWith("B")) {
			int building_no = Integer.parseInt(query.substring(1));
			for(int j=1;j<=FLOORS;j++)
				for(int k=1;k<=ROOMS;k++)
					available_rooms.add(new Room(k, j, building_no));
		}
		else if(query.startsWith("F")) {
			int floor_no = Integer.parseInt(query.substring(1));
			for(int i=1;i<=BUILDINGS;i++)
					for(int k=1;k<=ROOMS;k++)
						available_rooms.add(new Room(k, floor_no, i));
		}
		else if(query.startsWith("R")) {
			int room_no = Integer.parseInt(query.substring(1));
			for(int i=1;i<=BUILDINGS;i++)
				for(int j=1;j<=FLOORS;j++)
						available_rooms.add(new Room(room_no, j, i));
		}
		else 
			System.out.println("invalid query");
		
		for(Booking booking :bookings) {
			if(available_rooms.contains(booking.getRoom()) && booking.getDuration().overlaps(t)){
				available_rooms.remove(booking.getRoom());
			}
		}
					
		return available_rooms;
	}
	
}
