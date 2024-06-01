package bookexam.inheritance;

public class SnowTireExam354 {

	public static void main(String[] args) {
		SnowTire354 snow = new SnowTire354();
		
		//자식타입의 객체를 부모 타입의 객체에 담기
		//자식은 부모가 될 수 있다.
		Tire354 tire = snow;
		
		snow.run();//부모의 메소드가 자식에서 재정의 되면
		//super.run(); 이 실행문이 없는 한  (super라는 말이 있지 않는 한)
			//재정의된 자식의 메소드를 호출한다.
		
		tire.run();
		

	}

}
