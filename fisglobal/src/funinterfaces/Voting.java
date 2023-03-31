package funinterfaces;

public class Voting {
	
	public void checkAge(int age) {
		if(age >100 || age < 0)
			throw new InvalidAgeException();
		else if (age >=0 && age<=17 )
			throw new InsufficentAgeException();
		else
			System.out.println("You are eligible to vote..");
	}

}
