package class2;

public class CarMainExam227p {

	public static void main(String[] args) {
		//#1. Car클래스를 이용해서 객체를 생성
		Car227p car = new Car227p();
//		Car227p car;//car라는 클래스에 만들 주소를 담겠다
//		new Car227p();
		
		//car라는 클래스를 가지고 객체를 만든 타입, 참조타입   생성자(클래스 이름과 동일)
		Car227p aa = new Car227p();
		Car227p bb = new Car227p();
		
//		int[] new = new num{10, 20, 30};
//		new[] {10, 20, 30};
		
		//#2. 객체 사용
		System.out.println("car.company : "+car.company);
		System.out.println("car.model : "+car.model);
		System.out.println("car.color : "+car.color);
		System.out.println("car.maxSpeed : "+car.maxSpeed);
		System.out.println("car.speed : "+car.speed);
		
//		System.out.println("메소드 실행 : " +car.show());//메소드는 출력문에 들어갈 수 없다, 메소드에 이미 실행문도 들어있음
//		return 3(리턴값);이 들어있으면 3이 출력됨
		car.show();
		car.company = "삼성자동차";
		System.out.println("car.company : "+car.company);
		car.speed = 100;
		System.out.println("car.speed : "+car.speed);
		System.out.println("===========================");
		System.out.println("car1.company : "+car.company);
		System.out.println("car1.model : "+car.model);
		System.out.println("car1.color : "+car.color);
		System.out.println("car1.maxSpeed : "+car.maxSpeed);
		System.out.println("car1.speed : "+car.speed);
	}//end of main

}//end of class
