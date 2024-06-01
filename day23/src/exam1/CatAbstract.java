package exam1;

public class CatAbstract extends Animal {//모든게 추상이면 implements로 인터페이스
	//필드								//필드, 생성자 쓰고 싶으면 추상
	String name;						//메소드만 쓰고 싶으면 인터페이스
	int age;
	
	public CatAbstract(String name, int age) {
		super(name, age);
		this.name = name;
		this.age=age;
	}

	public void dive() {
		System.out.println(name+" 다이빙한다.");
		
	}
	
	@Override
	public void cry() {
		System.out.println(name+" 울었지");
		System.out.println(name+"는 건강하다. 부럽다..");
	}
	
	
	
}
