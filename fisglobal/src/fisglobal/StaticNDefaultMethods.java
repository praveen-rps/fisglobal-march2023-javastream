package fisglobal;

interface Shoppings{
	public void selectgoods();
	public void payment();
	public void shipement();
	public void otp();
	public static void regisration() {
		System.out.println("shop is registered in customs dept");
	}
}

class CashShops implements Shoppings{
	public void selectgoods(){
			System.out.println("select goods manaully");
	}
	public void payment(){
		System.out.println("cash payment");
	}
	public void shipement(){
		System.out.println("send goods with customers");
	}
}

class UpiShops implements Shoppings{
	public void selectgoods(){
			System.out.println("select goods manaully");
	}
	public void payment(){
		System.out.println("upi payment");
	}
	public void shipement(){
		System.out.println("send goods with customers");
	}
	@Override
	public void otp() {
		System.out.println("customized otp methods");
	}
	

}
public interface StaticNDefaultMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CashShops s1 = new CashShops();
		s1.selectgoods();
		s1.shipement();
		s1.payment();
		//s1.otp();
		Shoppings.regisration();
		
		UpiShops s2 = new UpiShops();
		s2.selectgoods();
		s2.shipement();
		s2.payment();
		s2.otp();

	}

}
