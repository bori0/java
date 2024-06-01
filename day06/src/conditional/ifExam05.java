package conditional;

import java.util.Scanner;

public class ifExam05 {

	public static void main(String[] args) {
		//#1. Scanner 객체 생성 - 입력을 받기
		Scanner scan = new Scanner(System.in);
		
//		//#2. 변수 선언
//		int amount = 0;
//		String receipt = "";
//		String receiptCheck = "";
//		
//		//#3. 안내 문구
//		System.out.print("수량을 입력 >>");
//		//3-1. 키보드에서 입력한 값을 변수에 담기
//		amount = scan.nextInt();
//		
//		//#4. 금액을 계산
//		int pay = amount*45000;//변수는 언제든지 변하지만 상수는 못 바뀐다.
////		                         상수를 쓰기 위해서는 final이라고 쓴다.
//		
//		System.out.print("영수증 필요하신가요?\n (1-필요 / 2-불필요) >>");
//		receiptCheck = scan.next(); //문자열, String 형으로 받음
//		
//		//변수에 담긴 문자열(receiptCheck)과 "1"이 같은지 비교
//		if(receiptCheck.equals("1")) {
//			 receipt = "여기 있습니다.";
//		}else {
//			 receipt = "없습니다.";
//			
//		}
//		
//		//#5.출력
//		System.out.println("금액은 " + pay + "입니다.");
//		System.out.println("영수증은 " + receipt);
//		
//		scan.close(); //scan 닫음
		
		
		
//		*refactoring(정리하는 것)
		
		//#2. 변수 선언
				int amount = 0, pay = 0;
				String receipt = "", receiptCheck = "";
				final int PRICE = 4500;//상수의 변수명은 대문자로만 쓴다
				
				//#3. 안내 문구
				System.out.print("수량을 입력 >>");
				//3-1. 키보드에서 입력한 값을 변수에 담기
				amount = scan.nextInt();
				//#4.금액을 계산
				pay = amount * PRICE;
				//PRICE = 5000;  상수는 선언한 부분을 제외하고 코드 중간에 변경할 수 없다
				
				System.out.print("영수증 필요하신가요?\n (1-필요 / 2-불필요) >>");
				receiptCheck = scan.next(); //문자열, String 형으로 받음
				
				//변수에 담긴 문자열(receiptCheck)과 "1"이 같은지 비교
				if(receiptCheck.equals("1")) {
					 receipt = "여기 있습니다.";
				}else {
					 receipt = "없습니다.";
					
				}
				
				//#4.출력
				System.out.println("금액은 " + pay + "입니다.");
				System.out.println("영수증은 " + receipt);
				
				scan.close(); //scan 닫음
	}

}
