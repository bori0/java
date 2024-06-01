package homework;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		//scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		String answer =""; //질문 답변
		String result = "";//답변이 정답인지 오답인지
		
		//day[][0] = 한국어 요일
		//day[][1] = 영어 요일
		String[][] day = {
				{"월요일", "monday"},
				{"화요일", "tuesday"},
				{"수요일", "wednesday"},
				{"목요일", "thursday"},
				{"금요일", "friday"},
				{"토요일", "saturday"},
				{"일요일", "sunday"}
		};
		
		//규칙적인 반복
		while(true) {
			for(int a=0; a<day.length; a++) {//월~일요일까지 7번 반복해서 질문
				//질문에 대한 답변 입력받기
				System.out.println(day[a][0]+"을 영어로 입력해 주세요 >>");
				answer=sc.nextLine();
				
				//답변이 맞는지 아닌지 판별
				for(int b=0; b<day.length; b++) {
					if(answer.equals(day[a][1])) {
						result = "정답";
					}else {
						result = "오답";
					}//end of if
				}//안쪽 for문 끝
				
				//정답인지 출력
				System.out.println(result);
			}//바깥쪽 for문 끝
			break;
		}//while의 끝
		
	}//end of main

}//end of class
