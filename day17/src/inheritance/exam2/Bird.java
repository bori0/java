package inheritance.exam2;

//		자식클래스 extends 부모클래스명{}   >>상속
public class Bird extends Animal{

	//#새만 가진 기능
	public void fly() {
		System.out.println("새가 날고 있다.");
	}
	@Override
	public void cry() {
		super.cry();//부모 메소드 호출
		
		System.out.println("11시43분");
	}
}
