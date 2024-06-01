package bookP247_;

public class Calculator {
	//#1. 필드 (=인스턴스 변수, 멤버변수)
	int num;
	
	//#2. 생성자(객체를 초기화)
	
	//#3.메소드-인스턴스 메소드(static이 없기 때문에 객체가 생성될 때 불려짐)
	//												바디
	//[접근 지정자] 리턴타입 메소드명(매개변수...){실행문장}
	public void powerOn() {
		System.out.println("전원 켬");
	}
	public int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	public double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	 public void powerOff(){
		 num=30;
		 System.out.println(this.num+"입니다.");
		 System.out.println("전원 끔");
	 }
	 
	 public void showInfo() {
		 int testResult = plus(10, 20)+30;
		 System.out.println(testResult);
		 
		 System.out.println(divide(5, 7));
	 }

}//클래스 끝
