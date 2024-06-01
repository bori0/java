package exam1;

public class VerticalLine extends LineInter{

	String name;
	int length;
		
	public VerticalLine(String name, int length) {
		super();
		this.name = name;
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println("수직선의 길이 : "+length); //private를 바로 부를 수 없어서 getLength부름
		//선그리기
		for (int i = 0; i < length; i++) {
			System.out.println("|");
		}
		System.out.println();//줄바꿈
	}

	@Override
	public void showInfo() {
		System.out.println(name+"을 그립니다.");
	}

}
