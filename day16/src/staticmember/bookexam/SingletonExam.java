package staticmember.bookexam;

public class SingletonExam {
	//#1.생성자
	//생성자의 제한타입이 private이면 외부에서 객체 생성 불가, 내부에서만 가능
	private SingletonExam() {}//기본 생성자
	
	//#2.필드 - 정적필드(static)
	//접근제한자 static 참조타입 참조변수(singleton값 담긴 주소가 담김)
	private static SingletonExam instance = new SingletonExam();
	//getter를 이용해서 불러야 함
	
	//#3.메소드
	//		반환타입		메소드명() {}
	static SingletonExam getInstace() {
		return instance;//반환타입은 singletonExam이랑 같아야함
		//SingletonExam 클래스를 가지고 만든 인스턴스(객체)를 반환
	}
}
