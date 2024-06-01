package bookexam.inheritance;

public class SnowTire354 extends Tire354{
	//생성자
	public SnowTire354() {}
	
	@Override
	public void run() {
//		super.run();//부모의 run() 메소드를 호출
					//자식의 재정의된 run() 메소드의 내용
		System.out.println("스노우 타이어가 굴러갑니다.");
//		super.run();//부모의 run()메소드 호출
	}

}
