package conditional;

import java.util.Scanner;

public class ifExam03 {

	public static void main(String[] args) {
		//#1. Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//#2. 변수 선언
		int num = 0;
		
		//#3. 안내 문구 및 입력 받기
		System.out.print("숫자 입력 > ");
		  //#3-1. 입력 값 변수에 넘겨 받기
		num = scan.nextInt();
		
		//#4. 처리
		if(num%2 == 0 || num%3 == 0) {//&& : 이고, 모두 해당하는
			                        //|| : 또는, 하나만 해당되어도
			num += 1000;
		}else {
			num += 5000;
		}
		
		//#5.출력
		System.out.println(num);
		
		scan.close(); //scan 닫음

	}

}
