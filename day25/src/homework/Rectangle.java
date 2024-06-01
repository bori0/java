package homework;

public class Rectangle extends Shape{
	//필드
	int width;//가로
	int height;//세로
	
	//생성자
	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	//메소드
	@Override
	public void draw() {
		System.out.println("사각형의 가로 길이 : "+width);
		System.out.println("사각형의 세로 길이 : "+height);
		
		for (int i = 0; i < height; i++) {//가로 먼저 그리게 됨
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}//for 안 끝
			System.out.println();//줄바꿈
		}//for 밖 끝
	}
	
	
	
	

}
