package fisglobal;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		
		switch(number) {
		default: System.out.println("No vechicle specified...");break;
		case 1 : System.out.println("car");break;
		case 2 : System.out.println("bus");break;
		case 3 : System.out.println("van");break;
		case 4 : System.out.println("jeep");break;
		
		}
		
		
		String state="ap";
		switch(state){
		case "ap": System.out.println("Andhra Pradesh");break;
		case "tn" : System.out.println("Tamilnadu");break;
		case "ts": System.out.println("Telengana"); break;
		}
		

	}

}
