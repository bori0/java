package exam2;

public class Gold extends Customer{

	//5% 할인, 0.3%적립
		final static double RATIO = 0.003;
		final static double DISCOUNT_RATE = 0.05;
		//vip랑 gold 둘 다 상수가 들어가는데 문제가 없을까?
		//클래스 안 vip, gold 폴더 안에 각자 들어가 있어서 별 문제 없음
		//다만, customer 안에 들어가면 문제가 생김
		
		//final double test = 5.5;
		//				직접 넣어서 써도 괜찮지만, 뭘 받을건지 명확해지기 때문에 씀
		//									enum타입 참조변수
		public Gold(String cid, String name, Grade grade) {
			super(cid, name, grade, RATIO, DISCOUNT_RATE);
			
		}
}
