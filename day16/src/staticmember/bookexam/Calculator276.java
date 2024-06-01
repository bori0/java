package staticmember.bookexam;

public class Calculator276 {
	//final : 여기서만 수정할 수 있음
		//static : 공통
	final static double PI=3.14152; //final이 붙었다 = 상수
//	= static final double PI=3.14152;  
	static int jumsu1 = 7;
	int instanceValue = 3;
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
	void showInfo(int num1, int num2) {
		int result = plus(num1, num2) + jumsu1;
		System.out.println("결과 : " + plus(num1, num2));
		System.out.println(result);
	}
	
	//스태틱에서는 인스턴스 변수, 인스턴스 메소드 호출 불가
//	static void printShow() {
//		System.out.println(instanceValue);//객체가 생성되어야 값이 생성되어 적용할 수 있다.
//										  //바로 값이 나오지 않기 때문에 ERROR 
//		showInfo(10, 20);//입력될 때까지 기다려야 값이 나옴..
//	}
}//클래스 끝
