package exam.inherted1;

public abstract class Animal {//추상 클래스
//	String name="짹짹";
//	
//	void cry() {//일반 메소드
//		System.out.println("동물의 울음소리");
//	}
	
	String name;
	int age;
	public Animal() {}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void show() {
		System.out.println("부모의 것");
	}

	public abstract void cry();//추상메소드
}
