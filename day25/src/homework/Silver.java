package homework;

public class Silver  extends Shopping{
	//상수
	final static double RATIO = 0.02;//적립율 2%
	final static double DISCOUNT_RATE = 0.1;//할인율 10%
	
	//생성자
	public Silver(String name, Grade grade) {
		super(name, grade, RATIO, DISCOUNT_RATE);
	}
	
}
