package exam.inherted1;

public class Bird extends Animal{
	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void cry() {
		System.out.println("Jack~");
		
	}
	
}
