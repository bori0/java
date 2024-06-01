package conditional;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		//#1.객체 생성
		Scanner scan = new Scanner(System.in);
		
		int drink = 0; //음료
		int num = 0; //수량
		int price = 0;// 가격
		String drinkResult ="";
		String countResult = "";
		int priceResult = 0;
		
		final int COFFEE_PRICE = 3500;
		final int LATTE_PRICE = 5500;
		final int COKE_PRICE = 1500;
		final int GREEN_TEA_PRICE = 3500;
		
		System.out.print("#1 주문할 음료를 선택하세요 ? >> \n [1.커피, 2.라떼, 3.콜라, 4.녹차]");
		drink = scan.nextInt();

		System.out.print("#2 주문수량을 입력하세요 >>");
		num = scan.nextInt();
		
		switch(drink) {
		case 1:
			drinkResult = "커피";
			priceResult = COFFEE_PRICE;// 가격 바로 써도 좋고, 계산식 적어놔도 괜찮다
			break;                     
		case 2:
			drinkResult = "라떼";
			priceResult = LATTE_PRICE;
			break;
		case 3:
			drinkResult = "콜라";
			priceResult = COFFEE_PRICE;
			break;
		case 4:
			drinkResult = "녹차";
			priceResult = GREEN_TEA_PRICE;
			break;
		}
		
		DecimalFormat f = new DecimalFormat("###,###");
		
		System.out.println();
		System.out.println("주문한 음료 :" + drinkResult);
		System.out.printf("주문 수량 : " + f.format(num)+ "\n");
		System.out.printf("결제 금액 : " + f.format(priceResult) +"원");

	}

}
