package Interfaceexam1;

public interface InterfaceAnimal {
	//인터페이스는 추상만 올 수 있다.
	//생성자 자체가 못 옴
	
	//#1.상수 - 인터페이스는 객체를 못 만드니까 자식이 만들어줘야함
	public static final int A=3; //static 객체 생성없이 class명.필드명으로 바로 사용
				//값을 변경할 수 없다, 상속불가
	//권장
	String NAME = "홍";//생략하면 컴파일러가 public static final자동으로 붙여줌
	
	public abstract void cry();//추상메소드
	void fly();//public abstract 컴파일러가 붙여줌
	
//	public void test() {};//인터페이스 안에는 완성 메소드 올 수 없음
						// default랑 static은 가능하나 주의
}
