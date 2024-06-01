package exam.inherted1;

public class Dog extends Animal{
	String name;
	int age;
	
//외부에서 객체를 생성하지 않도록 하는 것 : private
//패키지는 벗어났는데 자식들만 사용하도록 하는 것 :protected
	public Dog(String name, int age) {
		super(name, age);
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name+"가 자고 있다.");
	}
	
	@Override
	public void cry() {
		System.out.println(name+"가 멍멍");
	}

	@Override
	public String toString() {
		return "Dog [이름=" + name + ", 나이=" + age + "]";
	}
	
}
