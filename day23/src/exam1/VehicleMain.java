package exam1;

public class VehicleMain{

	public static void main(String[] args) {
		Bus bus= new Bus("버스", 4, 360, 10);
		bus.info();
		bus.drive();
		bus.run();

		Car car=new Car("소나타", 3, 90);
		car.info();
		car.drive();
	}

}
