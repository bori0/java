package exam1;

public class Cat extends Animal{
	//필드
	String name;
	int age;
	
	public Cat(String name, int age) {
		super(name, age);
		this.name = name;
		this.age=age;
	}

	public void dive() {
		System.out.println(name+" 다이빙한다.");
		
	}
	
	@Override
	public void cry() {
//		super.cry();//부모, 자식거 다 보고 싶을 경우, 자식거만 보고 싶으면 지우기
		System.out.println(name+"는 건강하다. 부럽다..");
	}
	
	
	
}
