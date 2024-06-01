package array;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		//#1.배열선언
		// int[] name = new int[3];
//		int[][] num = new int[2][3];
//		//			  new 타입[행의 길이][열의 길이];
		
		//#2.배열에 입력
//		num[0][0] = 5;
//		num[0][1] = 10;
//		num[0][2] = 20;
//		num[1][0] = 25;
//		num[1][1] = 30;
//		num[1][2] = 35;
		
		
		//배열선언
		int[][] num = new int[2][];//행의 길이는 생략 불가
		num[0] = new int[3];//나중에 객체가 담길거라 개념을 잘 알고 있으면 좋다.//블로그/배열/올리지않은거에 있음
		num[1] = new int[3];
		
		//배열에 값을 담기
		num[0][0] = 5;//행은 일정, 열은 변동
		num[0][1] = 10;
		num[0][2] = 20;
		num[1][0] = 25;//행은 일정, 열은 변동
		num[1][1] = 30;
		num[1][2] = 35;
		
		//배열의 내용을 출력
		for(int a=0; a<num.length; a++) {
			for(int b=0; b<num[a].length; b++) {
				System.out.println(num[a][b]);
			}
		}
		System.out.println("==================================");
		System.out.println();
		
		
		//int[][] score = new int[]{10, 20, 30};
		int[][] scores = new int[][] {//한줄로 써도 괜찮다
			//열1 열2 열3
			{10, 20, 30},//행1
			{40, 50, 60}//행2
		};
		
		for(int a=0; a<scores.length; a++) {
			for(int b=0; b<scores[a].length; b++) {
				System.out.printf("scores[%d][%d] = %d\n", a, b, scores[a][b]);
			}
		}
		System.out.println("==================================");
		System.out.println();
		
		int[][] scores2 = {
				{10, 20, 30},
				{40, 50, 60}
			};
		
		for(int a=0; a<scores2.length; a++) {
			for(int b=0; b<scores2[a].length; b++) {
				System.out.printf("scores2[%d][%d] = %d\n", a, b, scores2[a][b]);
			}
		}
		
		
	}//end of main

}//end of class