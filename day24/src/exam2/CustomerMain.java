package exam2;

public class CustomerMain {

	public static void main(String[] args) {
		Vip vip = new Vip("123", "길동씨", Grade.VIP);
		Gold gold=  new Gold("456", "춘향", Grade.GOLD);
		
		vip.showInfo(580_000);
		System.out.println();
		
		gold.showInfo(420_000);
		
//		Customer[] cust= {
//				new Vip("123", "길동씨", Grade.VIP),
//				new Gold("456", "춘향", Grade.GOLD)
//		};
//		for(Customer c : cust) {
//			c.showInfo(420_000);
//		}
//		
//		for (int i = 0; i < cust.length; i++) {
//			if(cust[i] instanceof Vip vip) {
//				vip.showInfo(420_000);
//			}//end of if
//			
//		}//end of for
		
	}

}
