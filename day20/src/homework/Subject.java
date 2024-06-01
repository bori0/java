package homework;

import java.text.DecimalFormat;

public class Subject {
						//음료선택번호, 음료주문수량
	public static void show(int choice, int orderCount) {
		String result="";//주문한 음료
		
		switch(choice) {
		case 1:
			result ="커피";
			break;
		case 2:
			result ="그린티";
			break;
		case 3:
			result ="콜라";
			break;
		case 4:
			result ="라떼";
			break;
		case 5:
			result ="없습니다.";
			break;
		}//switch문 끝
		
		DecimalFormat f = new DecimalFormat("#잔");
		System.out.println("----------------------------------------");
		System.out.println("주문하신 음료 : "+result);
		System.out.println("주문하신 수량 : "+f.format(orderCount));
	}//show 끝
	

}
