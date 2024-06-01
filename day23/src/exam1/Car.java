package exam1;

public class Car extends Vehicle{
	int sokdo;
	
	public Car(String name, int count, int sokdo) {
		super(name, count);
		this.sokdo = sokdo;
	}
	@Override
	public void drive() {
		super.drive();
		System.out.println(name+" 자동차가 "+sokdo+"속도로 달립니다.");
		System.out.println("현재 노랑색의 hybrid모델을 사용하고 있습니다.");
	}
	
}
