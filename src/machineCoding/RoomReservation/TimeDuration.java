package machineCoding.RoomReservation;

public class TimeDuration {

	private int start;
	private int end;
	
	
	public TimeDuration(int start, int end) {
		this.start=start;
		this.end=end;
	}
	
	public boolean overlaps(TimeDuration t) {
		
		TimeDuration t1,t2;
		if(this.start == t.start) {
			return true;
		}
		else if(this.start<t.start) {
			t1=this;t2=t;
		}
		else {
			t1=t;t2=this;
		}
		
		return t1.end>t2.start;
	}

	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + end;
		result = prime * result + start;
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
		TimeDuration other = (TimeDuration) obj;
		if (end != other.end)
			return false;
		if (start != other.start)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TimeDuration [start=" + start + ", end=" + end + "]";
	}
	
	public static void main(String[] args) {
		TimeDuration t1 = new TimeDuration(1,4);
		TimeDuration t2 = new TimeDuration(1,2);
		System.out.println(t1.overlaps(t2));
	}
	
}
