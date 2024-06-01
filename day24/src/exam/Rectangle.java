package exam;
			//직사각형
public class Rectangle extends Shape{
	//필드
	int width;//가로
	int height;//세로
	
	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
//		setWidth(width);//생성자란에 줄줄이 안 쓰고 이런 방식으로 쓰기도 함
	}

		
//	public int getWidth() {
//		return width;
//	}
//
//	public void setWidth(int weight) {
//		if(width>0) {//유효성 테스트
//			this.width = weight;
//		}else {
//			System.out.println("가로 길이는 0보다 커야합니다.");
//		}//생성자에서 유효성 테스트 가능하나 너무 길어짐
//	}
//
//	public int getHeight() {
//		return height;
//	}
//
//	public void setHeight(int height) {
//		this.height = height;
//	}


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
