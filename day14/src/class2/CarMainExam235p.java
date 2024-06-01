package class2;

public class CarMainExam235p {

	public static void main(String[] args) {
		//#1. Car235p 객체를 생성 - 객체, 인스턴스
		Car235p myCar;//스택에 자리잡음, 생성자를 따라가서 초기화된 자료들을 힙에 저장
		myCar = new Car235p();//주소를 myCar에 담아라 //1.생성자 먼저 처리, 2.필드 생성자에서 부족한 부분 채우기
//		Car235p myCar = new Car235p();
		
		System.out.println("myCar.company : "+myCar.campany);
		System.out.println("myCar.model : "+myCar.model);
		System.out.println("myCar.color : "+myCar.color);
		System.out.println("myCar.speed : "+myCar.speed);

	}//end of main

}//end of class
