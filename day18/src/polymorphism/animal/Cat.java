package polymorphism.animal;

public class Cat extends Animal{
	//#1.인스턴스 필드
	String name;
	int age;
	
	//#2.생성자
	public Cat(String name, int age) {
		super();//부모 생성자를 호출, 생략가능
		this.name = name;
		this.age = age;
	}
	
	//#3.인스턴스 메소드
	public void showInfo() {
		System.out.println(name+"의 나이는 "+age+"살입니다.");
	}
	
	@Override //@이가 붙은거 => 어노테이션, 재정의(overriding)
			  //부모의 메소드를 상속받아 자식이 자기에 맞게 고쳐쓰기
	public void cry() {
		System.out.println("야옹");
	}
}
