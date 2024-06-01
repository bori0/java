package homework;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String beverage="";
		int selectNo = 0;
		int numberOfOrder =0;
		
		while(true) {
			System.out.println("음료 번호 선택 >");
			System.out.println("======================================================");
			System.out.println("1. coffe | 2.greentea | 3. coke | 4. latte | 5. 주문종료");
			System.out.println("======================================================");
			System.out.println("번호 선택 >>");
			selectNo = sc.nextInt();
			
			if(selectNo==5) {
				System.out.println("주문 종료");
//				System.exit(0);
				break;
			}	
			switch(selectNo) {
			case 1:
				beverage = "커피 ";
				break;
			case 2:
				beverage="녹차 ";
				break;
			case 3:
				beverage="콜라 ";
				break;
			case 4:
				beverage="라떼 ";
				break;
			}
			System.out.println("주문수량 >>");
			numberOfOrder = sc.nextInt();
			
			System.out.println("주문하신 음료 : "+beverage);
			System.out.println("주문 수량 : "+numberOfOrder+"잔");
		}

	}

}
