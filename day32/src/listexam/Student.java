package listexam;

public class Student {
	//필드 - 인스턴스 필드, 객체가 생성되어야 사용할 수 있음
	String name;
	int age;
	
	//생성자 - class 이름과 같음, 객체를 초기화
	//		- class 이름과 같음	
	//private - 외부에서 생성하지 못 하게 막는 것
	public Student(String name, int age) {//생성자는 반환타입 없음
		this.name = name;//수정하면 안 될 때 생성자를 통해서 넘겨 받음 : 생성자 주입
		this.age = age;
	}
	
	//메소드 - 기능
	public String getName() {//get/set : 외부에서 수정해도 될 때 만드는 것
		return name;
	}
		
	public int getAge() {
		return age;
	}

	public void setName(String name) {//메소드는 반환타입있음
		this.name=name;//id, password 이런 것들 받아서 씀
	}
	
	public void showInfo() {
		System.out.print("// 이름 : "+name);
		System.out.print(" / 나이 : "+age);
		System.out.println();
	}
	
	
}
