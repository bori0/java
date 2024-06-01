package homework;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String beverage="";
		int selectNo = 0;
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
			
			if(selectNo<1 || selectNo>4) { //!(selectNo>=1 && selectNo<=4)
				System.out.println("번호 다시 선택");//밑의 조건보다 위에 적어줘야 함 
				//>> 위에서 아래로 인식하는데 else에서 다 걸림
//				return;//메소드를 빠져 나감
				//안 쓰면 밑의 조건이 실행됨
				continue;
			}
			if(selectNo==1) {
				beverage += "커피 ";
			}else if(selectNo==2) {
				beverage+="녹차 ";
			}else if(selectNo==3) {
				beverage+="콜라 ";
			}else {
				beverage+="라떼 ";
			}
			System.out.println("주문 계속?");
			System.out.println("1계속 | 0종료");
			System.out.println("번호 선택 >>");
			selectNo = sc.nextInt();
			
			if(selectNo==0) {
				System.out.println("주문 종료");
				System.out.println("주문하신 음료 : "+beverage);
				System.out.println();
				break;
			}
//			else {
//				continue;//이것이 문장의 마지막이면 생략
//			}
//			
		}
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
			System.out.println("주문하신 음료 : "+beverage);
		}
	}

}
