package Interfaceexam1;

public abstract class Animal {//힙에 올릴 수 없어음
	//#1.인스턴스 필드, 객체에 포함되어 있어 객체가 안 만들어지면 못 씀
	String name;
	int age;
	
	//#2.생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	//#3.일반 메소드 - 완성 메소드{}이 있으면 완성 메소드
	public void showInfo() {
		System.out.println("추상클래스입니다.");
	}
	
	//#4.추상메소드 - 미완성 메소드 >> {}, body가 없음
	public abstract void cry();
}
