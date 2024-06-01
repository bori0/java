package type;

import java.util.Scanner;

public class Bogang03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		System.out.println("첫 번째 숫자 입력 >> ");
		num1 = scan.nextInt();
		
		System.out.println("두 번째 숫자 입력 >> ");
		num2 = scan.nextInt();
		
		result = (num1 > num2)? num1 : num2;
//		int maxValue = (num1 > num2)? num1 : num2;
		
		System.out.println("두 수 중 큰 값은 " + result + " 입니다.");
		
		
	}

}
