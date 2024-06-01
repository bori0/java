package conditional;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cash = 0;
		
		System.out.println("결제 금액 입력 >>");
		cash = scan.nextInt();
		
		if(cash >= 300_000){
			System.out.println("상품권 5천원 증정");
		}
		
//		if(cash >= 300_000)//한줄밖에 안 될 때 중괄호{} 지울 수 있음,
//			               //대신 어디까지가 범위인지 모를 수 있음
//			                
//			System.out.println("상품권 5천원 증정");
//		System.out.println("상품권 5천원 증정"); //추가로 쓰는건 그냥 출력되는 것임
			
		
		scan.close(); //scan 닫음
	}

}
