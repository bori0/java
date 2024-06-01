package bookExam01;

import java.util.Scanner;

public class Exam161_7_4 {

	public static void main(String[] args) {
		// 강사님 코드3
		
		//#1. Scanner 객체(=인스턴스;누구에게 소속됐어~의 의미) 생성
		Scanner scan = new Scanner(System.in);
		
		//#2. 변수 선언
		boolean run = true;
		int deposit = 0; //입금
		int withdrawal = 0;//출금
		int balance = 1000; //잔고
		
//		balance = balance + deposit;//이렇게 쓰고 switch 안에 안 써준다면 balance는 바뀌지 않는다
									//첫 식만 변화
		
		//반복문 
		while(run) {
			
			//#3.공통 출력 부분
			System.out.println("======================================");
			System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("======================================");
			System.out.print("선택 >> ");
			
			//#4. 선택한 번호를 읽어오기
			int menuSelectNum = Integer.parseInt(scan.nextLine());
			
			if(menuSelectNum ==1) {
				System.out.print("예금액 > ");
				balance = balance + Integer.parseInt(scan.nextLine());
				
			}else if(menuSelectNum ==2){
				System.out.print("출금액 > ");
				balance = balance - Integer.parseInt(scan.nextLine());
				
			}else if(menuSelectNum ==3){
				System.out.print("잔고 > ");
				
				break;
			}else if(menuSelectNum ==4){
				run = false;
//				break;// if{}을 제외한 자신을 감싸고 있는 가장 가까운 반복문을 빠져나감
			}//end of if
			
			System.out.println();//줄바꿈	
			System.out.println("======================================");
			System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("======================================");
			System.out.println("선택 >> "+ balance);
		}//end of while
	
		System.out.println("프로그램 종료");
		
	}//end of main  //false를 가지고 while로 올라가서 조건을 보고 나서 빠져나감

}//end of class
