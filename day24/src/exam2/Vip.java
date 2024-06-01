package exam2;

public class Vip extends Customer{
//10% 할인, 0.5%적립
	final static double RATIO = 0.005;//넘겨주는거라 static 붙여야함
	final static double DISCOUNT_RATE = 0.1;//상수
	//	  ㄴ부모쪽으로 넘겨주고 싶은데 받을 값이 없고
	//		자식에서 상수 선언된게 있으면(이미 메모리에 올라가 있는게 있으면
	//		static을 붙여서 보냄
	//final이 붙어서 고칠 수 없음
	
	final int A = 10;
	int test=10*A;//객체가 만들어진 다음 실행되는거라 문제 없음
	
	public Vip(String cid, String name, Grade grade) {
		super(cid, name, grade, RATIO, DISCOUNT_RATE);
		
	}

}
