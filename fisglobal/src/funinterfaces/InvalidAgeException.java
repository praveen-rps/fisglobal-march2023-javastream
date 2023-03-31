package funinterfaces;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException() {
		super("Age cannot be more than 100 or less than 0");
	}

}
