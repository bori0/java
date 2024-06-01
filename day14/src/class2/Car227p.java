package class2;

public class Car227p {//설계도, 틀
	//#1. 필드
	String company ="현대 자동차";//미리 써두면 모든 곳을 쓰겠다는 의미
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 300;
	int speed;//만들면서 추가하려면 String company;
	
	//#2. 생성자 - 생략하면 컴파일러가 컴파일시 자동으로 생성, 클래스 이름과 동일해야함
	//				책에는 생략되어 있음
	public Car227p() {} //기본 생성자
	
	//#3. 메소드
	public void show() {
		System.out.println("자동차 이름 : "+ company);
		if(speed>=maxSpeed) {
			System.out.println("속도가 최대치를 초과했습니다.");
			System.out.println("속도를 다시 설정해주세요");
		}//end of if
//		return 3;//void말고 타입쓰고 리턴값이 주어질 경우 프린트 실행문에 들어갈 수 있다.
	}//end of show

}//end of class


/*생성자랑 메소드는 비슷
생성자는 파라미터(넘겨받는 것) 생략가능, 삽입도 가능
생성자(타입 변수명)쓸 수 있음
*/