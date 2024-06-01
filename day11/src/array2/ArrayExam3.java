package array2;

import java.util.Scanner;

public class ArrayExam3 {

	public static void main(String[] args) {
		// 정수를 하나 입력받아 배열에서 같은 값이 몇 번째 요소인지 구하기, 없으면 없다고 출력하기
	    // 점수(score) { 79, 88, 33, 100, 50, 90 }
		//#1.scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//#2.변수선언
		int input = 0;
		int count = 0;
		
		//#3.배열 변수와 초기화
		int[] number = { 79, 88, 33, 100, 50, 90 };
		
		//#4.입력받기
		System.out.print("숫자 입력 >>");
		input= scan.nextInt();
		
		//#5.비교하기
		for(int b=0; b<number.length; b++) {
			System.out.println("b : "+b);
			System.out.println("초기 count : "+count);
			count++;//for문 안에 있으면 계속 초기화가 되기 때문에 밖에 선언
			System.out.println("중기 count : "+count);
			if(input==number[b]) {
				System.out.println("찾는 값 : " +number[b]);
				System.out.println("배열의 위치 : " + b +"번째 요소");
				break;
			}
			if(count == number.length) {//위 if에서 해당되면 거기서 끝
										//해당 안 되면 1==6, 2==6,,,6==6이면 찾는 값 없어지는 거임
				System.out.println("찾는 값이 없습니다.");
			}//end of if
			
		}//end of for
		

	}//end of main

}//end of class
