package homework;

public class HorizonLine extends Line{

	public HorizonLine(String name, int length) {
		super(name, length);
	}

	@Override
	public void draw() {
		System.out.println("수평선 길이 :"+getLength());//부모에게서 받은 길이
		for (int i = 0; i < getLength(); i++) {//적은 갯수만큼 출력되는 수평선
			System.out.print("-");//오른쪽으로 나열하기 위해 print
		}
	}
	
	

}
