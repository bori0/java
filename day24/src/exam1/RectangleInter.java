package exam1;

public class RectangleInter implements ShapeInter{
	//필드
	int width;//가로
	int height;//세로
		
	public RectangleInter(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

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

	@Override
	public void showInfo() {
		System.out.println("사각형을 그립니다.");
		
	}

}
