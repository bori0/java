package homework;

public class VerticalLine extends Line{

	public VerticalLine(String name, int length) {
		super(name, length);
	}

	@Override
	public void draw() {
		System.out.println("수직선의 길이 : "+getLength());
		for (int i = 0; i < getLength(); i++) {//부모로부터 받아오는 길이
			System.err.println("|");//수직으로 길어지기 때문에 println
		}
	}
	
	

}
