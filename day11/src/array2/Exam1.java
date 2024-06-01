package array2;

import java.util.Arrays;

public class Exam1 {

	public static void main(String[] args) {
		//홍길동의 국어 80점, 영어 70점 , 수학 90점을 받았습니다.
		//세과목 모두 60점 이상이면 이번 시험에서 "통과" 그렇지 않으면 "탈락"
		
		int[] number= {80, 50, 70};
		String[] name = {"국어", "영어", "수학"};
		String s= "";
		
		//1. 한번에 합격 통과
		if(number[0]>=60 && number[1]>=60 && number[2]>=60) {
			s = "합격";
		}else {
			s = "불합격";
		}
		
		//2. 배열길이만큼 작업 후 합격 통과, 컴퓨터에 과부하 올 수도 있다
		for(int i = 0; i<name.length; i++) {
			if(number[i] >= 60) {
				s = "합격";//[0]번째가 60이상이면 s에 기록하는 작업이 여러번 이루어질 수 있음
			}else {
				s="불합격";
				break;
			}
		}
		System.out.println(s);
		
	}//end of main

}//end
