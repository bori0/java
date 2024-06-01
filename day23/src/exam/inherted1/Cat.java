package exam.inherted1;

public class Cat extends Animal{
	String name;
	int age;
	
//	public Cat(String name, int age) {
//		super();//기본생성자가 생략되어 있음/ animal에는 기본생성자 없이 생성자가 생겨져 있어서 오류
//		this.name=name;
//		this.age= age;
//	}//다르게 쓸거면 필요, 바꿔쓸거면 괜찮
	
	public Cat(String name, int age) {
		super(name, age);
		this.name=name;
		this.age= age;
	}
	
	@Override
	public void cry() {
		System.out.println(name+"이가 이양");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}
