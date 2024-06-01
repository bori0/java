package staticmember.exam;

public class CarExample {

	public static void main(String[] args) {
		//#1.객체 생성
		Car myCar = new Car("포르쉐",0);
		Car yourCar = new Car("벤츠",0);
		
		myCar.run();
		yourCar.run();
		
//		myCar.setSpeed(10); // private이라 ERROR
//		youtCar.setSpeed(10); // private이라 ERROR
		
		
	}

}
