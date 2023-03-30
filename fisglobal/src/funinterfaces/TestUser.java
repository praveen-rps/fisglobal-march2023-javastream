package funinterfaces;

import java.util.function.Predicate;

class User{
	String username;
	String password;
	User(String username, String password){
		this.username=username;
		this.password=password;
	}
}

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<User> 
		p = usr-> usr.username.equals("admin") && usr.password.equals("admin");
		
		User user1 = new User("admin","admin");
		User user2 = new User("admin","12345");
		
		if ( p.test(user2))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");

	}

}
