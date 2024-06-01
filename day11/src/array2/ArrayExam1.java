package array2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayExam1 {
	//						(매 개 변 수)
	//								지역변수
	public static void main(String[] args) {
		/*다음은홍길동반 학생들의 성적입니다.
		*총점과 평균을 구하는 프로그램 작성하기
		성적(score) ={100, 88, 100, 90, 50}*/
		
		//#1.변수선언
//1)	int[] score = new int[5];
//		score[0] = 100;
//		score[1] = 88;
//		...
//2)	int[] score = new int[] {100, 88, 100, 90, 50};
		int[] score = {100, 88, 100, 90, 50};//선언과 동시에 초기화
		int sum = 0;//지역변수를 초기화를 시킨다.
		double avg = 0.0; //float avg = 0.0f;
		
		
		//#2.계산
		for(int i=0; i<score.length; i++) {
			sum += score[i]; //
		}
		avg = (double)sum/score.length; //정수/정수 =정수 이기 때문에 강제 형변환
		
		//#3. 출력
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"] = "+ score[i]);
		}
		System.out.println("전체 합계 : " + sum);
		System.out.println("전체 평균 : " + avg);
		
		
	}//end of main

}//end of class
