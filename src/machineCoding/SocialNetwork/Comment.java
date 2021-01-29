package machineCoding.SocialNetwork;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Comment {
	static HashMap<Integer,Comment> comments = new HashMap<>();
	
	int id;
	String text;
	User owner;
	Post post;
	LocalDateTime timestamp;
	
	private Comment(String text, Post post, User owner) {
		this.id = comments.size()+1;
		this.text = text;
		this.owner = owner;
		this.post = post;
		this.timestamp = LocalDateTime.now();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Comment other = (Comment) obj;
		if (id != other.id)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
		
	
}
