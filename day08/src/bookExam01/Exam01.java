package bookExam01;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		//#1.Scanner 객체생성
		Scanner scan = new Scanner(System.in);
		
		//#2.변수 생성
		String menu = "";
		int orderNum = 0;
		int answer = 0;
		int totalPrice = 0;
		int COFFEE_PRICE = 3500;
		int COKE_PRICE = 1000;
		int LATTE_PRICE = 5500;
		int GREEN_TEA_PRICE = 4300;
		
		
//		//#3.질문생성
//		System.out.print("메뉴를 선택하세요.\n [커피 | 콜라 | 라떼 | 녹차] >>");
//		menu = scan.nextLine();
//		System.out.print("주문 수량을 적어주세요 >> ");
//		orderNum = scan.nextInt();
//		System.out.print("계속 주문 하시겠습니까?\n [1.네 / 2.아니오] >>");
//		answer = scan.nextInt();
		
		//#4.반복문 및 출력할 문장
		while(true) {
			System.out.print("메뉴를 선택하세요.\n [커피 | 콜라 | 라떼 | 녹차] >>");
			menu = scan.next();
			System.out.print("주문 수량을 적어주세요 >> ");
			orderNum = scan.nextInt();
			System.out.print("계속 주문 하시겠습니까?\n [1.네 / 2.아니오] >>");
			answer = scan.nextInt();	
			
			//4-1. 다시 주문할 경우
			if(answer ==1) {
				continue;
			}
			break;		
		}//while의 끝
		
		//#4-2.주문 끝난 경우
		if(answer ==2) {
			if(menu.equals("커피")){
				totalPrice = orderNum * COFFEE_PRICE;				
			}else if(menu.equals("콜라")){
				totalPrice = orderNum * COKE_PRICE;
			}else if(menu.equals("라떼")){
				totalPrice = orderNum * LATTE_PRICE;
			}else if(menu.equals("녹차")){
				totalPrice = orderNum * GREEN_TEA_PRICE;	
			}// if의 끝

		}	
		
		//#5.출력
		System.out.println("<주문 현황>");
		System.out.println("주문한 음료 : " + menu);
		System.out.println("주문 수량 : " + orderNum);
		System.out.println("주문 금액 : " + totalPrice);		
		

	}

}
