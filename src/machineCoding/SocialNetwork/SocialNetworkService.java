package machineCoding.SocialNetwork;

import java.time.LocalDateTime;

public class SocialNetworkService {

	
	public static void main(String[] args) {
		execute("signup~lucious");
		execute("signup~albus");
		execute("signup~tom");
		execute("login~tom");
		execute("shownewsfeed");
	}
	
	
	public static void execute(String query) {
		
		String[] s = query.split("~");
		if(s[0].contentEquals("signup")) {
			User.signup(s[1]);
		}
		else if(s[0].contentEquals("login")) {
			User.login(s[1]);
		}
		else if(s[0].contentEquals("shownewsfeed")) {
			User.current_user.showNewsFeed();
		}
		else if(s[0].contentEquals("follow")) {
			User.current_user.follow(s[1]);
		}
		else if(s[0].contentEquals("post")) {
			User.current_user.addPost(s[1]);
		}
		
	}
}
