package machineCoding.Cab;

import java.util.Arrays;
import java.util.HashSet;

public abstract class User {

	protected String name;
	protected double rating;
	protected int ride_count;
	protected HashSet<User>blacklist;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getRide_count() {
		return ride_count;
	}
	public void setRide_count(int ride_count) {
		this.ride_count = ride_count;
	}
	public HashSet<User> getBlacklist() {
		return blacklist;
		
	}
	public void addRating(int rating, User user) {
		ride_count++;
		this.rating=((ride_count-1)*(this.rating)+rating)/ride_count;
		if(rating == 1) {
			blacklist.add(user);
			user.blacklist.add(this);
		}
	}
	
	@Override
	public String toString() {
		String ans =  this.name+" "+this.rating+" "+this.getRide_count()+" [";
		for(User u : blacklist)
			ans+=u.name+" ";
		ans+="]";
		return ans;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ride_count;
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
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		if (ride_count != other.ride_count)
			return false;
		return true;
	}
	
	
	
	
	
	
}
