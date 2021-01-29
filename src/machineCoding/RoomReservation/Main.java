package machineCoding.RoomReservation;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		BookingService bs = BookingService.getInstance();
		
		bs.book(new Room(1,2,1), new TimeDuration(0,5), new Person("hk"));
		bs.book(new Room(1,1,1), new TimeDuration(12,14), new Person("hk"));
		bs.book(new Room(1,1,1), new TimeDuration(14,16), new Person("hk"));
		bs.book(new Room(1,1,1), new TimeDuration(17,20), new Person("hk"));
		bs.book(new Room(1,1,1), new TimeDuration(0,5), new Person("hk"));
		bs.unbook(new Room(1,1,1), new TimeDuration(12,15), new Person("hk"));
		
		for(Booking b: bs.getSummary(new Room(1,1,1),new TimeDuration(13, 24) ))
			System.out.println(b);
		
		for(Room r : bs.suggestRooms(new TimeDuration(1, 18), null)) {
			System.out.println(r);
		}
			
		
	}
}
