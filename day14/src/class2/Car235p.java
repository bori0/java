package class2;

public class Car235p {//설계도
	//#1.필드(=멤버변수, 인스턴스 변수) 객체 안에 속함>>힙
	String campany = "현대자동차";
	String model;
	String color;
	int speed;
	
	//#2.생성자
	public Car235p() {//초기화시킬 내용, 유효성 검사, 없을시는 생략가능
//		super();//부모의 기본생성자를 호출, 항상 들어가 있는데 보통생략되어있음
		model = "소나타";
		color = "빨강";
	}
	//#3.메소드
	public void showInfo(int speed, String color) {
		
	}
}//end of class
