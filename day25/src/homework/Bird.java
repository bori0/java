package homework;

public class Bird implements Countable{
	//필드
	String name;
	
	//생성자
	public Bird(String name) {
		super();
		this.name = name;
	}

	//메소드
	public void fly() {
		System.out.println("2마리 "+name+"가 날고 있어요");
	};
	
	//재정의
	@Override
	public void count() {
		System.out.println(name+"가 2마리 있다.");
		
	}

}
