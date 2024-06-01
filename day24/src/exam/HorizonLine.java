package exam;

public class HorizonLine extends Line {

	public HorizonLine(String name, int length) {
		super(name, length);
	}

	@Override
	public void draw() {
		System.out.println("수평선의 길이 : "+getLength());	
		
		//선그리기
		for (int i = 0; i < getLength(); i++) {
			System.out.print("=");//수평선이라 줄바꿈 안 함
		}
		System.out.println();
	}

	
}
