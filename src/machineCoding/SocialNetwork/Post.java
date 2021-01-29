package machineCoding.SocialNetwork;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Post {
	static HashMap<Integer,Post> posts = new HashMap<>();
	private int id;
	private String text;
	private User owner;
	private ArrayList<Comment> comments;
	private int upvotes;
	private int downvotes;
	private LocalDateTime timestamp;
	
	private Post(String text, User owner){
		this.text = text;
		this.id = posts.size()+1;
		this.owner = owner;
		this.downvotes = 0;
		this.upvotes = 0;
		this.comments = new ArrayList<Comment>();
		this.timestamp = LocalDateTime.now();
	}
	
	public int score() {
		return this.upvotes-this.downvotes;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public int getUpvotes() {
		return upvotes;
	}

	public void setUpvotes(int upvotes) {
		this.upvotes = upvotes;
	}

	public int getDownvotes() {
		return downvotes;
	}

	public void setDownvotes(int downvotes) {
		this.downvotes = downvotes;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
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
		Post other = (Post) obj;
		if (id != other.id)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", text=" + text + ", owner=" + owner.name + ", comments=" + comments + ", upvotes="
				+ upvotes + ", downvotes=" + downvotes + ", timestamp=" + timestamp + "]";
	}

	public static Post createPost(String text, User owner) {
		Post post = new Post(text, owner);
		posts.put(post.id,post);
		return post;
	}

	
	
	
	
	
}
