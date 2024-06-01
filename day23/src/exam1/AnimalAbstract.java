package exam1;

public abstract class AnimalAbstract {
	//#1.필드
	String name;
	int age;
	
	//#2.생성자 -초기화
	public AnimalAbstract(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public abstract void cry();//추상메소드
}
