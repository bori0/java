package staticmember.exam;
//접근제한자
public class Car {//public이 사라지면 default가 됨, 같은 패키지 안에서만 사용가능
				  //클래스가 default인데 생성자가 public일 수 없음
	//#1. 필드, 웬만하면 private(계산식..)-public등의 메소드로만 호출해서 씀
	String model;
	int speed; //- 스택에 저장  Integer speed; - 힙에 저장되어 주소를 넘겨줌
	int[] score;
	
	//#2.생성자- 클래스 이름과 같음, 메소드와 비슷하게 쓰임, 생략가능
	public Car() {}

//	public Car(String model, int number) {
//		this.model=model;
//		score=new int[number];
//	}

	public Car(String model, int number) {
		this.model=model;
		score=new int[number];
	}
	
	//#3.메소드
	private void setSpeed(int speed) {
		this.speed=speed;
		return; //생략되어 있음, 실행하고 불러준 곳으로 다시 돌아간다
	}
	
	public void run() {
		for(int a=10; a<50; a++) {
			this.setSpeed(a);//내 객체의 메소드, setSpeed(a)
//			System.out.println(this.model+"가 달립니다.(시속 : "+this.speed+"km/h");
			System.out.println(model+"가 달립니다.(시속 : "+speed+"km/h");//명확하면 this 생략가능
		}
	}
}
