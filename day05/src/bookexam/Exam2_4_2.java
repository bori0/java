package bookexam;

import java.util.Scanner;

public class Exam2_4_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 수 : ");
		String strNum1 = scan.nextLine();// scan.next(); 문자열
		//        scan.nextInt(); 정수, scan.nextDouble(); 실수형
		
		System.out.println("두번째 수 : ");
		String strNum2 = scan.nextLine();
		
		int num1 = Integer.parseInt(strNum1);//정수로 변환
		int num2 = Integer.parseInt(strNum2);
		// Double.parseDouble(); 실수로 변환
		int result =num1 + num2;
		
		System.out.println("덧셈 결과 : " + result);
		
		
		scan.close(); //scan 닫음
	}

}
