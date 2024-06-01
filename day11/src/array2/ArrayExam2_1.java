package array2;

public class ArrayExam2_1 {

	public static void main(String[] args) {
		// 다음 자료의 최댓값과 최솟값을 구하는 프로그램을 작성하시오
	    //점수(score) = {100, 88,100,90,50}
		
		//#1.변수 선언
		int[] score = {100, 88, 100, 90, 50};
		int max = 50;
//		int max = score[0];
		
		//1) max출력방식
		System.out.println(Math.max(max, score[0]));

		//2) max출력방식
		for(int a=0; a<score.length; a++) {
			max = Math.max(max, score[a]);
		}
		System.out.println(max);
		
//		int max = Integer.MIN_VALUE;//상수
//		int min = Integer.MAX_VALUE;//상수
		

	}//end of main

}//end of class
