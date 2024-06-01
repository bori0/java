package array2;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 다음 자료의 최댓값과 최솟값을 구하는 프로그램을 작성하시오.
	    // 점수(score) { 79, 88, 33, 100, 50, 90 }
		
		
		int[] score = { 79, 88, 33, 100, 50, 90 };
		int max = score[0];//배열의 0인덱스 값, 가장 큰 값을 담을 변수
			//max = 0;
//			max = Integer.MIN_VALUE;//정수 타입의 최소값
		int min = score[0];//배열의 0인덱스 값, 가장 작은 값을 담을 변수
			//min = 999;  //제시된 값들보다 훨씬 큰 값
//			min = Integer.MAX_VALUE;//정수 타입의 최대값
		
		
		//최대값, 최소값 계산
		for(int i = 0; i<score.length; i++) {
			
			//최대값 구하기
			if(max<score[i]) {
			///max 변수에 담긴 값이 배열의 i번째 요소값보다 작으면 max변수에 i번째 요소의 값을 저장
				max = score[i];
			}//end of if
			
//			max = Math.max(max, score[i]); //if를 쓰거나 이것을 쓰거나

			//최소값 구하기
			if(min>score[i]) {
			//min변수에 담긴 값이 배열의 i번째 보다 크면 작은 값이 배열의 i번째이므로, min에 더 작은 값을 담아줌
					min = score[i];
			}//end of if
		}//end of for
		
		
		System.out.println(max);
		System.out.println(min);

	}//end of main

}//end
