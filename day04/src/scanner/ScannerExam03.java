package scanner;

import java.util.Scanner;

public class ScannerExam03 {

	public static void main(String[] args) {
				
		//#1.변수 선언
		int num1=0;
		String result1 = "";
		
		//#2.Scanner 객체 생성
		Scanner scan = new Scanner(System.in); //System.in:키보드로 입력한 것을
		//                             		     new Scanner에 담아서 scan에 주소를 넣어 놓아라.
//												 main 바로 밑에 안 써도 됨
		//#3.안내문구
		System.out.print("입력할 숫자 : ");
		
		//#4.입력받은 값 변수에 담기
		num1 = scan.nextInt();
		
		result1 = (num1%2==1)? "홀수" : "짝수";
		
		System.out.println("당신이 입력한 숫자는 "+ num1 + "이고, "+ result1 + "입니다.");
		System.out.printf("당신이 입력한 숫자는 %d이고, %s입니다.\n", num1, result1);

	}

}
