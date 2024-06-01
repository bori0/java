package exam1;

public class Dog extends Animal{
	//필드
//	String name;
//	int age;
	
	public Dog(String name, int age) {
		super(name, age);
//		this.name = name;
//		this.age = age;
	}
	
	public void run() {
		System.out.println(name+" 달린다.");
		
	}

}
