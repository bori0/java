package exam;

public abstract class CountableAbstract {//스스로 객체 생성 불가
	//추상클래스는 필드, 생성자, 메소드(일반, 미완성)를 가질 수 있다.
	//#1.필드
	String name;
	int num;

	//#2.생성자
	public CountableAbstract(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	//#3.메소드
	//추상 메소드- 미완성 메소드, body {중괄호}가 없는 메소드
//	public abstract void count();
	//일반 메소드로 변경하고싶으면 public void count() {};로 바꾸면 됨
	public void count() {};
}
