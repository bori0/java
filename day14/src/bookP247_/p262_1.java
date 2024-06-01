package bookP247_;

public class p262_1 {

	public static void main(String[] args) {
		p262 myCar = new p262();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : "+speed+"km/h");

	}

}
