package bookExam;

public class Exam352 {
	public static void method1(Parent351 parent) {
		if(parent instanceof Child351) {//Child 타입으로 변환이 가능한지 확인
			Child351 child = (Child351)parent;
			System.out.println("method1 - Child351로 변환 성공");
		}else {
			System.out.println("method1 - Child351로 변환되지 않음");
		}//if끝
	}//method1 끝

	public static void method2(Parent351 parent) {
		Child351 child = (Child351)parent;//classcastException이 발생할 가능성 있음
		System.out.println("method2 - Child로 변환 성공");
	}//method2 끝
	
	
	public static void main(String[] args) {
		Parent351 parentA = new Child351();
		method1(parentA);// child 객체를 매개값으로 전달
		method2(parentA);
		
		Parent351 parentB = new Parent351();
		method1(parentB);//parent 객체를 매개값으로 전달
		method2(parentB);
	}//end of main
}
