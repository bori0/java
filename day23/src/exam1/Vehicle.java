package exam1;

public abstract class Vehicle {
	//필드
	String name;//차종
	int count;//차 대수
	
	//생성자
	public Vehicle(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
	//메소드
	void info() {
		System.out.println(name+"입니다. "+name+"가 "+count+"대 있습니다.");
	};
	void drive() {
		System.out.println(name+" 주행 중");
	};
	
}
