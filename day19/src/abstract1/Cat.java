package abstract1;

public abstract class Cat extends Animal{//부모가 미완성 클래스
	//cry메소드를 완성 시키거나 미완성 시킬거면 클래스 이름에 abstract붙여주면 됨
	//#1.필드
	String name;
	
	///#2.생성자
	public Cat(String name) {
		super();//생략, Animal의 기본생성자 호출
		this.name = name;
	}
	
	//#3.메소드
	public void showInfo() {
		System.out.println("고앵일 입니다.");
	}
	
}
