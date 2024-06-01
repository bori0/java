package exam1;

public class HorizonLineInter extends LineInter {

	String name;
	int length;
	
	public HorizonLineInter(String name, int length) {
		super();
		this.name = name;
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println(name+ "의 길이 : "+length);
		//선그리기
		for (int i = 0; i < length; i++) {
			System.out.print("=");//수평선이라 줄바꿈 안 함
		}
		System.out.println();
	}

	@Override
	public void showInfo() {
		System.out.println(name+"을 그립니다.");
	}

	public void printShow() {
		draw();
		showInfo();
		System.out.println();//줄바꿈
	}
}
