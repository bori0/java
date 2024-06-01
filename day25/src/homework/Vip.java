package homework;

public class Vip extends Shopping{
	//상수
	final static double RATIO = 0.05;//적립율 5%
	final static double DISCOUNT_RATE = 0.1;//할인율 10%
	
	//생성자
	public Vip(String name, Grade grade) {
		super(name, grade, RATIO, DISCOUNT_RATE);
	}
	
}
