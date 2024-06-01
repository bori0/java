package class2;

import java.util.Scanner;

public class FruitsExam {

	public static void main(String[] args) {
		//#1. scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//#2. 변수 선언 및 초기화
		//과일은 2차원 배열
		//fruit[][0] : 한글 과일이름
		//fruit[][1] : 영어 과일이름
		String[][] fruit ={
				{"사과", "apple"},
				{"수박","watermelon"},
				{"복숭아", "peach"},
				{"딸기", "strawberry"},
				{"귤", "tangerine"}
		};//2차원 배열 선언 끝
		
		
		//#3.질문
		for(int a=0; a<fruit.length; a++) {
			String dap ="";//질문에 대한 사용자 답변
			//밖에서 쓸 일이 없으면 {}안에 넣어줌
			
			//질문
			System.out.printf("질문%d) ' %s '의 영어 이름을 입력하시오 >>", (a+1), fruit[a][0]);
			dap = scan.nextLine();
			
			//정답 여부 판단
			if(dap.equals(fruit[a][1])) {
				System.out.println("정답");
			}else {
				System.out.println("오답");
				System.out.println("정답은 ' "+fruit[a][1]+"입니다.");
			}//end of if
		}//end of for
	}//end of main

}//end of class
