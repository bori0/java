package bookExam;

public class Car341{
	//필드 - 자동차는 4개의 타이어를 가짐
	Tire340 frontLeftTire = new Tire340("앞왼쪽", 6);// 위치, 최대 회전 수
	Tire340 frontRightTire = new Tire340("앞오른쪽", 2);
	Tire340 backLeftTire = new Tire340("뒤왼쪽", 3);
	Tire340 backRightTire = new Tire340("뒤오른쪽", 4);
	
	//생성자 - 생략되면 기본 생성자 컴파일시 생성
	
	//메소드
//default 리턴타입 메소드명(){ } - 생략하면 default, 같은 패키지의 클래스들에서 사용가능
	int run() {//모든 타이어를 1회 회전시키기 위해 각 tire 객체의 roll()메소드를 호출,
		//false를 리턴하는 roll()이 있을 경우, stop()메소드를 호출하고 해당 타이어 번호를 리턴
		System.out.println("[자동차가 달립니다.]");
		
		if(frontLeftTire.roll()==false) {stop(); return 1;}//stop메소드 호출, 펑그이기 때문에
		if(frontRightTire.roll()==false) {stop(); return 2;}//해당 위치의 타이어 번호
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		
		return 0;// 위 조건이 모두 만족하지 않을 때
	}//end of run
	
	void stop() {//펑크 났을 때 실행
		System.out.println("[자동차가 멈춥니다.]");
	}//end of stop
}
