package type;

import java.util.Scanner;

public class Bogang02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //어디서든 한번만 설정하면 된다.
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("첫 번째 숫자 입력 >> ");
		num1 = scan.nextInt();
				
		System.out.println("두 번째 숫자 입력 >> ");
		num2 = scan.nextInt();
		
		System.out.println("첫 번째 숫자 : " + num1);
		System.out.printf("두 번째 숫자 : %d", num2);
		

	}

}
