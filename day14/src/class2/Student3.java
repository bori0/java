package class2;

public class Student3 {
	//#1.필드 //객체가 만들어지기 전까지 쓸 수 없다.
	String name;
	int age;
	int score;
	
	//#2.생성자
	public Student3() {
		this("홍길동", 20, 85);
	}
	public Student3(int score) {
		this("김자바", 22, score);
	}
	public Student3(String name) {
		this(name, 22, 90);
	}	
	public Student3(String name, int score) {
		this(name, 25, score); 
	}
	public Student3(String name, int age, int score) {
		this.name =name; 
		this.age =age;
		this.score =score;
	}
	
	//#3.메소드
	
}
