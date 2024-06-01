package Interfaceexam1;

public interface Controllable {
	//상수
//	int TEST //들어갈 수 있음
	
	void turnOn();//추상메소드, public abstract 생략
				//추상클래스 : public abstract void turnOn();
	void turnOff();
	//void repair();
	
	//처음부터 미리 구현해 놓아야 한다. default, static
	default void repair() {//자식이 오버라이딩 할 수 잇음
		System.out.println("제품을 공장에 보내에 수리해야 합니다.");
	}
	
	//누구나 공통으로 사용
	static void reset() {
		System.out.println("제품을 초기화시켜야 합니다.");
	}
}
