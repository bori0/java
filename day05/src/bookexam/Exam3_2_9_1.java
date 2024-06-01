package bookexam;

public class Exam3_2_9_1 {

	public static void main(String[] args) {
		int a = 7;
		double b = 0.0;
		
		System.out.println((a+b)+3); //Infinity(무한대)
		
		System.out.println(7 % 0); //오류, ArithmeticException: / by zero
		System.out.println(7 % 0.0); //NAN
		System.out.println((a % b) + 3); //NAN

	}

}
