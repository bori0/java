package staticmember.exam;

public class PenMainExam {

	public static void main(String[] args) {
		//#1.pen 객체 생성
		Pen red = new Pen("red");
		Pen green = new Pen("green");
		Pen red2 = new Pen("RED");
		Pen blue = new Pen("blue");
		Pen red3 = new Pen("RED");
		
		int countResult = red3.getCount();//이렇게 쓰는게 더 좋다
		
		System.out.println(countResult);//객체 하나마다 다 1로 저장되기 때문에 1이 나옴
		System.out.println(red3.getAllCount());//1이 나옴
		
		
	}

}
