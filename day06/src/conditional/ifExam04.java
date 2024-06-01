package conditional;

import java.util.Scanner;

public class ifExam04 {

	public static void main(String[] args) {
		//#1. Scanner 객체 생성 - 입력을 받기
		Scanner scan = new Scanner(System.in);
		
		//#2. 변수 선언
		int num = 0;
		String result = "";
		
		//#3. 안내 문구 및 입력 받기
		System.out.println("숫자를 입력 > ");
		num = scan.nextInt();
		//num = Integer.parseInt(scan.next());
		
		//#4.처리
		if(num%2 == 1) {
			result = "A class";
		}else{
			result = "B class";
		}
		
		//#5.출력
		System.out.println("당신의 번호 : " + num);
		System.out.println("당신의 강의실 : "+ result);
		
		scan.close(); //scan 닫음

	}

}
