package machineCoding.RoomReservation;

public class Room {

	private int number;
	private int floor;
	private int building;
	
	public Room(int number, int floor, int building) {
		this.number = number;
		this.floor = floor;
		this.building = building;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getBuilding() {
		return building;
	}
	public void setBuilding(int building) {
		this.building = building;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + building;
		result = prime * result + floor;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (building != other.building)
			return false;
		if (floor != other.floor)
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Room [number=" + number + ", floor=" + floor + ", building=" + building + "]";
	}
	
	
}
