package bookP247_;

public class p251 {

	public static void main(String[] args) {
		//
		p250 p = new p250();
		p.powerOn();
		
		int result1 = p.plus(5, 6);
		System.out.println(result1);
		
		byte x=10;
		byte y=4;
		double result2= p.divide(x, y);
		System.out.println(result2);
		
		p.powerOff();
	}

}
