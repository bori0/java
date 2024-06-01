package homework;

public class ShoppingMain {
	public static void main(String[] args) {
		Vip vip = new Vip("콩쥐", Grade.VIP);
		
		//vip일 경우 출력
		vip.showInfo(45000);
		System.out.println("===================");
		
		Shopping[] shop= {
				new Vip("홍길동", Grade.VIP),
				new Gold("성춘향", Grade.GOLD),
				new Silver("이몽룡", Grade.SILVER),
				new General("심청이", Grade.GENERAL)
		};
				
		//같은 가격, 다른 등급일 경우 출력 1
		for (int i = 0; i < shop.length; i++) {
			shop[i].showInfo(16000);
			System.out.println();
		}//1 끝
		
		System.out.println("----------");
		
		//같은 가격, 다른 등급일 경우 출력 2
		for(Shopping a : shop) {
			a.showInfo(420000);
			System.out.println();
		}//2의 끝
	}//메인의 끝

}
