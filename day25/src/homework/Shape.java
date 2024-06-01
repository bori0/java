package homework;

public abstract class Shape {
	//필드
	String name;

	//생성자
	public Shape(String name) {
		super();
		this.name = name;
	}
	
	//메소드
	public abstract void draw();//그림그리는 메소드
	
	public void show() {
		draw();//그림 그리는 메소드
		System.out.println(name+"을 그립니다");//뭘 그리는지 출력
	}

}
