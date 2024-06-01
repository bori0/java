package array2;

import java.text.DecimalFormat;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayExam1_1 {
	//				   목차의 개념
	public static void main(String[] args) {
		/*다음은홍길동반 학생들의 성적입니다.
		총점과 평균을 구하는 프로그램 작성하기
		성적(score) ={100, 88, 100, 90, 50}
		이름(studentName) = {"홍길동", "김자바", "이자바", "박디비", "송디비"}
		//출력형태
		===================
		 번호  이름  성적  
		===================
		 1	  홍길동  100  
		 2.   김자바   88
		===================
		 인원수 : 5명
		 전체 합계 : ??
		 전체 평균 : ??.??*/
		
		//#1.변수 선언
		String[] studentName = new String[]{"홍길동", "김자바", "이자바", "박디비", "송디비"};
		int[] score = {100, 88, 100, 90, 50};//선언과 동시에 초기화
		int count = 0;//인원수 체크(배열 길이로 인원수를 사용해도 됨)
		int sum = 0;//합계
		double avg = 0.0; //평균
		
		System.out.println("=========================");
		System.out.println("번호\t이름\t성적");
		System.out.println("=========================");
		
		//#2.계산
		for(int i=0; i<score.length; i++) {
			count++;//인원수, count+=1;
			sum += score[i]; //합계를 누적
			System.out.printf("%3d %6s %5d\n", (i+1), studentName[i], score[i]);
		}
		
//		count = score.length;//가능
		System.out.println("=========================");
		
		//평균
		avg = (double)sum/score.length; 
		
		//#3. 출력
//		for(int i=0; i<score.length; i++) {
//			System.out.println("score["+i+"] = "+ score[i]);
//		}
		
		DecimalFormat df = new DecimalFormat("0명");//패턴, 문자열
		DecimalFormat f = new DecimalFormat("0.00점");//패턴, 문자열
//		System.out.println(studentName); //studentNamer이 담고 있는 주소 출력
		System.out.println("인원 수 : " + df.format(count));
//		System.out.println("인원 수 : " + score.length);
		System.out.println("전체 합계 : " + sum);
		System.out.println("전체 평균 : " + f.format(avg));
		
		
	}//end of main

}//end of class
