package homework;

import java.util.Scanner;

public class Exam5 {
	
public static void calc(int choice, int num) {
	int price;
	
	if(choice ==5) {
		System.exit(0);
	}
	if(choice ==1) {
		price = (num*3000);
	}else if(choice ==2) {
		price = (num*4500);
	}else if(choice ==3) {
		price = (num*1500);
	}else {
		price = (num*5500);
	}
	System.out.println(price);
}

public static void showInfo(int choice, int num) {
	String order;
	
	if(choice ==5) {
		System.out.println("주문 종료");
	}
	if(choice ==1) {
		order ="커피";
	}else if(choice ==2) {
		order ="녹차";
	}else if(choice ==3) {
		order ="콜라";
	}else {
		order ="라떼";
	}
	System.out.println("주문음료 : "+order);
	System.out.println("주문수량 : "+num);
	System.out.print("주문금액 : ");
	calc(choice, num);
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.println("1. coffe(3,000)| 2.greentea(4,500) | 3. coke(1,500)| 4. latte(5,500) | 5. 주문종료");
		System.out.println("-------------");
		System.out.print("번호 선택 >>");
		int choice = Integer.parseInt(sc.nextLine());
		
		System.out.print("주문 수량 입력 >>");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println();
		showInfo(choice, num);
	}

}
