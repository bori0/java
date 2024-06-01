package array2;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayExam1_2 {//공간만 확보, 입력받기
	//				   목차의 개념
	public static void main(String[] args) {
		/*다음은홍길동반 학생들의 성적입니다.
		총점과 평균을 구하는 프로그램 작성하기
		성적(score) ={100, 88, 100, 90, 50}
		이름(studentName) = {"홍길동", "김자바", "이자바", "박디비", "송디비"}*/
		
		//#1.변수 선언
		String[] studentName = new String[5];
		int[] score = new int[5];
		int sum = 0;//합계
		double avg = 0.0; //평균
		
		//#2.입력 받기
		Scanner scan = new Scanner(System.in);
				
		//#2.계산
		for(int i=0; i<score.length; i++) {
			System.out.print("이름, 성적을 입력 >>");
			studentName[i] = scan.nextLine();//next은 공백으로 구분, 다시 질문 받으려면 엔터
			score[i] = Integer.parseInt(scan.nextLine());// nextLine은 엔터로 구분
			
			sum += score[i]; //합계를 누적
//			System.out.printf("%3d %6s %5d\n", (i+1), studentName[i], score[i]);
		}
		//평균
		avg = (double)sum/score.length; 

		//#3. 출력
		System.out.println("=========================");
		System.out.println("번호\t이름\t성적");
		System.out.println("=========================");
		
//		for(int i=0; i<score.length; i++) {
//			System.out.printf("%3d %6s %5d\n", (i+1), studentName[i], score[i]);
//		}
		
		//3-1 향상된 for문을 이용한 출력
		for(int num : score){//위에 선언된 타입에 따라 메소드 입력, int score이므로 int
			System.out.print(num+" ");
		}
			
		System.out.println("=========================");
		
		DecimalFormat f = new DecimalFormat("0.00점");//패턴, 문자열
		System.out.println("전체 합계 : " + sum);
		System.out.println("전체 평균 : " + f.format(avg));
		
		
	}//end of main

}//end of class
