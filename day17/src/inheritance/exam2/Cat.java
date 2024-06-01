package inheritance.exam2;

public class Cat extends Animal{
	//#1.필드
	String eat;
	
	//#2.생성자
	public Cat(String name, int age, String eat) {
		super();//부모의 기본 생성자 호출, 생략 가능
		this.name = name;
		this.age = age;
		this.eat = eat;
	}
	
	public void jump() {
		System.out.println(name+"가 높이 뛴다.");
	}
	
	@Override //재정의, 부모것을 자식이 고쳐쓴다.
	public void cry() {
		System.out.println(name+" 은 " + eat+" 을 먹는다.");
		System.out.println("야옹");
	}
}
