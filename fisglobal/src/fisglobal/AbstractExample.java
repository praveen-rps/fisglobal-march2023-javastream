package fisglobal;
abstract class Shopping{
	public void selectGoods(){
		System.out.println("goods are selecte manually");
	}
	public abstract void payment();

	
	public void shipment(){
		System.out.println("goods are carried on their own");
	}
}

class CashShop extends Shopping{
	public void payment(){
		System.out.println("payment is through cash only");
	}
}

class UpiShop extends Shopping{
	public void payment(){
		System.out.println("payment is through upi payment only");
	}
}


public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashShop s1 = new CashShop();
		UpiShop s2 = new UpiShop();
		s1.selectGoods();
		s1.payment();
		s1.shipment();
		
		s2.selectGoods();
		s2.payment();
		s2.shipment();
		
		
	}

}
