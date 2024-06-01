package type;

import java.util.Scanner;

public class Bogang01 {

	public static void main(String[] args) {
		//#1.입력받기위한 scanner 객체 생성
		Scanner scan = new Scanner(System.in);
				
		//#2.변수 선언
		int score = 0;
		String result ="";
		
		//#3. 키보드로부터 입력 받기
		System.out.println("점수 입력 >> ");
		
		score = scan.nextInt();
		
		//#4. 판별
		result = (score >= 70)? "통과" : "재수강";
		
		//#5.출력
		System.out.println("당신의 점수는 " + score + "입니다.");
		System.out.println("이번 시험은 " + result + "입니다.");


	}

}
