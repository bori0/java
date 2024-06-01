package class1;

public class StudentMainExam {

	public static void main(String[] args) {
		//#1. 설계도(붕어빵틀, 클래스)를 가져다 객체(붕어빵, 인스턴스)를 만들기
		Student std = new Student();
		//타입  [좌(참조변수)=우] 타입이 맞아야함
//		new Student(); //이렇게 써도 되는데 위치를 모르기 때문에 위와 같이 선언
		
		//#2. 만든 객체 사용
		//#2-1. 객체 안(뱃 속)에 있는 필드에 값을 담기
		std.name = "홍길동";
		std.age = 20;
		std.score = 70;
		
		//#2-2. 객체의 (뱃속에 있는) 필드 내용 읽어오기
		System.out.println("std.name : "+ std.name);
		System.out.println("std.age : "+ std.age);
		System.out.println("std.score : "+ std.score);
		
		//#3. 객체의 (뱃속에 있는) 메소드를 호출
		std.gotoSchool();
	}//end of main

}//end of class
