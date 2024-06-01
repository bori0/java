package array;

import java.util.Scanner;

public class ArrayExam2_2 {

	public static void main(String[] args) {
		//선생님 코드
		//#1.scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//#2. 숫자 입력받기
		System.out.println("숫자를 입력하세요 >>");
		int number = scan.nextInt();// 행과 열을 결정하기 위한 것
		
		//#3. 행과 열에 값을 쓰기 위한 변수 선언
		int count = 1;
		
		//#4. 값을 담고 출력
		for(int a=0; a<number; a++) {//행방향 출력을 결정
			System.out.print((a+1)+"=>\t");//줄바꿈 안 함, 가독성을 위해 괄호를 쓰는걸 추천
			for(int b=0; b<number; b++) {//열방향 출력
//				System.out.print(count+"  ");
				System.out.printf("%5d", count);//값을 출력
				count += number;//입력받은 숫자만큼 증가하기 위해서
			}//안쪽 for문 끝
			System.out.println();//줄바꿈
		}//바깥쪽 for문 끝
	}//main 끝

}//class 끝
