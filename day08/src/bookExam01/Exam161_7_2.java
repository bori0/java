package bookExam01;

import java.util.Scanner;

public class Exam161_7_2 {

	public static void main(String[] args) {
		// 강사님 코드2
		//while {if~~~ 또는 switch}로 하나하나 써도 되나, 반복
		//지역변수(예금, 출금, 잔고)는 if의 밖에 선언
		//boolean의 장단점
		
		//#1. Scanner 객체(=인스턴스;누구에게 소속됐어~의 의미) 생성
		Scanner scan = new Scanner(System.in);//util은 자동으로 읽어지지 않기 때문에
		                                      //import를 적어서 불러온다.
		
		//#2. 변수 선언
		boolean run = true; //while의 조건을 설정, true는 변동이 없음
							//true 아니면 false만 받을 수 있다.
//		long balance = 0L;// 21억이 넘을 수 잇기 때문에 long을 쓰는게 좋다.
						  //코딩 테스트 할 때 주의!
		int balance = 0; //잔고
		
		//반복문 
		while(run) {//true
			//break보다는 false를 써서 중지 시키고 싶어서 run을 씀
			
			//#3.공통 출력 부분
			System.out.println("======================================");
			System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("======================================");
			System.out.print("선택 >> ");
			
			//##수정한 부분###4. 선택한 번호를 읽어오기
//			String menuSelectNum = scan.nextLine();// 수정할 부분##case "1"로 바꿔줘야함
			                            //엔터(특수문자)까지 가져감 공백으로 인식하기 때문에
			                            //엔터 후 while이 두번 나옴
									//1, 2, 3으로 읽어옴
			int menuSelectNum = Integer.parseInt(scan.nextLine());
								//문자로 읽어서 정수로 바꿈 수정할 부분
			                    //only 숫자만 들어있는걸 바꿀 수 있음
								//2a나 4$ 같이 문자가 들어가면 안 됨, ERROR
								//"1", "2", "3"으로 읽어옴
			//1, 2, 3으로 바꿔주는 것
			
			//#5. 읽어온 번호를 이용해 처리
			switch(menuSelectNum) {
			case 1:
				System.out.print("예금액 > ");//잔고 = 기존잔고 + 현재 입금받은 예금액
				balance = balance + Integer.parseInt(scan.nextLine());
				                                     //##수정할 부분 ##여기는 int 안 고침##
				break;// while로 다시 감
			case 2:
				System.out.print("출금액 > ");//잔고 = 기존잔고 - 현재 입력 출금액
				balance = balance - Integer.parseInt(scan.nextLine()); //수정할 부분##
//				나중에 출금액이 0이나 -일 경우 어떻게 처리할지도 생각해보면 좋음
				break;
			case 3:
				System.out.print("잔고 > ");
				System.out.println(balance);
				break;
			case 4:
				//while문 종료, break;를 써서 종료를 해도 되지만 run = false 처리
				//현재 run에는 true가 담겨 있기에 false수정해서 while문을 끝내려 함
				run = false;
				break;
			}//end of switch
			
			System.out.println();//줄바꿈	
			
		}//end of while
	
		System.out.println("프로그램 종료");
		
	}//end of main

}//end of class
