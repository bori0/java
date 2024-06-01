package homework;

public class Shopping {
	//필드
	private String name;//회원명
	private Grade grade;//회원등급
	
	int point;//포인트
	int payment;//결제 금액
	double ratio;//적립금
	double discount;//할인율
	
	//생성자
	public Shopping(String name, Grade grade, double ratio, double discount) {
		super();
		this.name = name;//회원명
		this.grade = grade;//회원등급
		this.ratio = ratio;//적립금
		this.discount = discount;//할인율
	}
	
	//포인트 계산 메소드
	private void calcpoint(int price) {
		point +=(int)(price*ratio);
	}//포인트 계산 끝
	
	//할인된 결제금액 계산 메소드
	private void calcpay(int price) {
		payment = (int)(price*(1-discount));
	}//할인된 결제금액 계산 끝

	//고객 정보 출력 메소드
	public void showInfo(int price) {
		calcpoint(price);//포인트계산
		calcpay(price);//할인계산
		System.out.println("회원명 : "+name);
		System.out.println("회원등급 : "+grade);
		System.out.println("구입금액 : "+payment+"원");
		System.out.println("포인트 : "+point);
	}//고객정보 메소드 끝
}
