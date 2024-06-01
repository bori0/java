package exam2;

public class Customer {
	//고객아이디, 고객명, 등급 - 정보 클래스
	//보너스 포인트, 결제금액, 적립금, 할인율 - 계산 클래스
	//나누는게 좋지만 이번에는 그냥 해보는걸로
	
	//#필드
	private String cid;//고객아이디
	private String name;//고객명
	private Grade grade;//고객등급
	
	//별도로 분류해도 됨(class)
	int point; //보너스 포인트
	int paymentAmount;//결제 금액
	double ratio;//적립율
	double discountRate;//할인율
	
	//#생성자
	public Customer(String cid, String name, Grade grade, double ratio, double discountRate) {
		super();
		this.cid = cid;
		this.name = name;
		this.grade = grade;
		this.ratio = ratio;
		this.discountRate = discountRate;
	}
	
	//#포인트 계산 메소드
	private void calcPoint(int price) {
		point +=(int)(price*ratio);
		
		//private면 고객정도 출력 메소드를 되도록 별도로 뺄 것 - public이면 상관없음
		System.out.println(name+" 현재 포인트 누적액은 "+point+"입니다.");
	}
	
	//#결제 금액 계산 메소드
	private void calcPrice(int price) {
		paymentAmount = price-(int)(price*discountRate);
	}
	
	//#고객 정보 출력 메소드
	public void showInfo(int price) {
		System.out.println(name+" 님의 등급은 "+grade+"입니다.");
		calcPoint(price);
		calcPrice(price);
		System.out.println(name+" 님의 결제 금액은 "+paymentAmount+"입니다.");
	}
	
}
