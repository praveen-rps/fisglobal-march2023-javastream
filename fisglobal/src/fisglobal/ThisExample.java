package fisglobal;
class Test1{
	Test1(){
		//Test1();
		System.out.println("Inside the default constructor");
	}
	
	Test1(int x){
		this();
		System.out.println("Inside the parameterized constructor");
		show();
		
	}
	public void show() {
		//Test1();
		
	}
}
public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		Test1 t2 = new Test1(10);
		

	}

}
