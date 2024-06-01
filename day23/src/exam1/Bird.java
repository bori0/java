package exam1;

public class Bird extends Animal{
	//필드
	String name;
	int age;
	
	public Bird(String name, int age) {
		super(name, age);
		this.name = name;
		this.age = age;
	}

	public void fly() {
		System.out.println(name+"이는 난다요.");
		
	}
}
