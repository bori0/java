package exam;

public class Point extends Shape{
	
	public Point(String name) {
		super(name);
		// 부모를 자식이 완성시켜주기 위해
		//포인트 객체 생성할 때 (new Point("점");
		//먼저 Shape 도형을 초기화시키고 난 후, 자신의 Point 도 초기화시킴
	}

	@Override
	public void draw() {
		//점 하나 그리기
		System.out.println(".");
	}
	
}
