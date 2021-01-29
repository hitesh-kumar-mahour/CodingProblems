package machineCoding.SocialNetwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

class cmp implements Comparator<Post>{
	public int compare(Post a, Post b) {
		if(User.current_user.follows.contains(a.getOwner()) && !User.current_user.follows.contains(b.getOwner()))
			return -1;
		else if(!User.current_user.follows.contains(a.getOwner()) && User.current_user.follows.contains(b.getOwner()))
			return 1;
		else if(a.score()!=b.score())
			return b.score()-a.score();
		else if (a.getComments().size()!=b.getComments().size())
			return b.getComments().size()-a.getComments().size();
		else
			return a.getTimestamp().compareTo(b.getTimestamp());
	}
}

public class User {
	
	static HashMap<String,User> users = new HashMap<>();
	static User current_user;
	
	int id;
	String name;
	HashSet<User>follows;
	ArrayList<Post>posts;
	
	private User(String name) {
		this.id=users.size()+1;
		this.name= name;
		this.follows = new HashSet<User>();
		this.posts = new ArrayList<Post>();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public static void signup(String name) {
		User u = new User(name);
		users.put(u.name,u);
		
	}
	public static void login(String name) {
		if(users.containsKey(name)) {
			current_user = users.get(name);
			current_user.showNewsFeed();
		}
		else {
			System.out.println("Username not found : "+name);
		}
	}


	public void showNewsFeed() {
		
		ArrayList<Post> posts = new ArrayList<Post>();
		
		for(String username:users.keySet()) {
			posts.addAll(users.get(username).posts);
		}
		
		Collections.sort(posts,new cmp());
		
		for(Post post: posts)
			System.out.println(post);
		
	}
	
	public void follow(String username) {
		if(!users.containsKey(username)) {
			System.out.println("User not found : "+username);
			return;
		}
		
		this.follows.add(users.get(username));
	}


	public void addPost(String text) {
		
		Post post = Post.createPost(text,current_user);
		current_user.posts.add(post);
		
	}
	
	
	
}
