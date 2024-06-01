package homework;

public class Gold extends Shopping{
	//상수
	final static double RATIO = 0.03;//적립율 3%
	final static double DISCOUNT_RATE = 0.1;//할인율 10%
	
	//생성자
	public Gold(String name, Grade grade) {
		super(name, grade, RATIO, DISCOUNT_RATE);
	}
	
}
