package homework;

public class General extends Shopping{
	//상수
	final static double RATIO = 0.01;//적립율 1%
	final static double DISCOUNT_RATE = 0.0;//할인율 0%
	
	//생성자
	public General(String name, Grade grade) {
		super(name, grade, RATIO, DISCOUNT_RATE);
	}
	
}
