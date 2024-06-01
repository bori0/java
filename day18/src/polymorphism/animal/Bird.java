package polymorphism.animal;

public class Bird extends Animal {
	String name;
	int age;
	
	public Bird(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name+"의 나이는 "+age+"살입니다.");
	}
	public void cry() {
		System.out.println("짹짹");
	}
}
