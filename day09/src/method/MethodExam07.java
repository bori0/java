package method;

public class MethodExam07 {

	public static void main(String[] args) {
		//전자계산기
		//1.전원켜기 - powerOn()
		//2.계산 - plus(4, 3), minus(8, 3), multiple(3, 5), division(5, 2)
														  //정수/정수해도 실수 나올 수 잇음)
		//3.전원끄기 - powerOff()
		
		powerOn();
		int resultPlus = plus(4, 3);
		int resultMinus = minus(8, 3);
		int resultMultiple = multiple(3, 5);
		int resultDivision = division(5, 0);
				
		System.out.println("4 + 3 = "+resultPlus);
		System.out.println("8 - 3 = "+resultMinus);
		System.out.println("3 * 5 = "+resultMultiple);
		if (resultDivision ==0) {
			System.out.println("0으로 못 나눔");
		}else {
			System.out.println("5 / 2 = " + resultDivision);
		}
		
		
		powerOff();
	}// end of main
	
	public static void powerOn() {
		System.out.println("전원켜기");
	}
	
	public static void powerOff() {
		System.out.println("전원끄기");
	}
	
	public static int plus(int a, int b) {
		return a + b;
	}
	public static double plus(double a, int b) {
		//메소드 오버로딩 : 메소드 이름이 같고, 매개변수 타입이 다르거나 또는
		//					매개변수의 개수가 다르면
		return a + b;
	}	
	public static int minus(int a, int b) {
		return a - b;
	}
	public static int multiple(int a, int b) {
		return a * b;
	}
	public static int division(int a, int b) {//b!==0
		if(b==0) {
			return 0;
			}
		return a / b;
	}

}//end of class
