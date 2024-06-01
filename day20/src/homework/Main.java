package homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//scanner객체 생성
		Scanner sc = new Scanner(System.in);
		
		int choice=0;//음료 번호
		int orderCount=0;//주문 수량
		
		//음료의 선택과 수량입력
		System.out.println("음료 번호를 선택해 주세요");
		System.out.println("--------------------------------------------------------");
		System.out.println("1. coffe | 2.greentea | 3. coke | 4. latte | 5. 주문종료");
		System.out.println("--------------------------------------------------------");
		System.out.print("번호 선택>> ");
		choice = sc.nextInt();
		System.out.print("주문 수량을 입력하세요");
		orderCount = sc.nextInt();
		
		//출력화면 메소드
		Subject.show(choice, orderCount);	
		
		
		
	}//end of main
	
}//end of class
