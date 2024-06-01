package exam1;

public class Animal {
	//#1.필드
	String name;
	int age;
	
	//#2.생성자 -초기화
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void cry() {
		System.out.println("동물들 우러?");
		System.out.println(name+" 움");
		System.out.println(name+"는 "+age+" 살");
	};
//	public void cry() {};//abstract
//	void cry() {}
}
