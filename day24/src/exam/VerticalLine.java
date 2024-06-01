package exam;

public class VerticalLine extends Line{

	public VerticalLine(String name, int length) {
		super(name, length);
	}

	@Override
	public void draw() {//손주가 조상의 메소드 완성시키기
		System.out.println("수직선의 길이 : "+getLength()); //private를 바로 부를 수 없어서 getLength부름
		//선그리기
		for (int i = 0; i < getLength(); i++) {
			System.out.println("|");
		}
		System.out.println();//줄바꿈
	}

	
	
}
