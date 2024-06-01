package bookexam.inheritance;

public class Child329 extends Parent329{
	//#1.필드
	private int studentNo;
	
	//#2.생성자
	public Child329(String name, int studentNo) {
//		super();//부모의 기본생성자 호출, 생략
		//컴파일 에러 해결 방안 : 부모생성자 호출을 부모클래스에 있는 생성자를 보고 만들어줌
		//부모클래스에는 String 타입의 매개변수를 하나 가진 생성자가 있음
		//따라서 자식도 매개값 하나를 전달하는 super()을 호출
		super(name);
//		this.name =name;
		this.studentNo = studentNo;
	}

	public void showInfo() {
		System.out.println("부모의 name : " +super.name);
		System.out.println("자식의 name : " +name);
		super.name="이강산";
		System.out.println("부모의 name 변경 : "+ super.name);
	}
	

}
