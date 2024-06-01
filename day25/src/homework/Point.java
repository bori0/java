package homework;

public class Point extends Shape{

	public Point(String name) {
		super(name);
	}

	@Override//재정의
	public void draw() {//점 하나 그리기
		System.out.println(".");
		
	}
	
	
	
}
