package operator1;

public class OperatorExam1 {

	public static void main(String[] args) {
		System.out.println(5 / 3); //1
//		System.out.println(4 / 0); //0으로 나눌 수 없다
		System.out.println(4 / 0.0); //Infinity(무한대의 값이 됨)
		
		int num1=5;
		int num2=3;
		
		System.out.println("num1 + num2 = " +(num1+num2));
		System.out.println("num1 - num2 = " +(num1-num2));
		System.out.println("num1 * num2 = " +(num1*num2));		
		System.out.println("num1 / num2 = " +(num1/num2));		
		System.out.println("num1 % num2 = " +(num1%num2));
		
		System.out.println(2+3*5/2-7);
		
		//곱셈, 나눗셈이 +- 연산자보다 우선 순위가 높음
	}

}
