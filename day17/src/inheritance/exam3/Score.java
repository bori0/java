package inheritance.exam3;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("홍길동의 점수 입력 >>");
		int score = sc.nextInt();
		
//		if(score>=80) {
//			System.out.println("통과");
//		}else {
//			System.out.println("재수강");
//		}
		
		String result = (score>=80)? "통과" : "재수강";
		System.out.println(result);

	}

}
