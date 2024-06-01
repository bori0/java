package array3;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class ArrayExam1_1 {
	
//#1. Scanner 객체 생성 -모든 메소드에서 사용하기 위해
	static Scanner scan = new Scanner(System.in);
//#2.변수선언
	static String[] beverage= {"아메리카노", " 라    떼 ", " 콜    라 ", " 홍    차 "};//음료 종류
	//main이든 어디든 static을 붙이면 모두 쓸 수 있긴하다
	static int[] price= {2500, 4500, 1500, 5500};//음료 가격
	static int[] numberOfOders= new int[4];//음료가 4개이기 때문에 공간은 4개만 필요
	//주문 수량을 누적할 변수
	static int[] amountOfMoney= new int[4];//개별 주문 금액을 누적할 공간

	
	public static void main(String[] args) {
		//#1. Scanner 객체 생성 -main 메소드에서만 사용하기 위해
//		static Scanner scan = new Scanner(System.in);
		
		//#2-1.변수선언
	    int continuingOrNot=0;//진행 여부
	    int beverageChoice=0;//음료 선택 번호를 담을 변수
	    int numbers=0;//주문 수량
	    
	    //#3. 음료 판매 시작
	    while(true) {
	    	//주문 받는 메세지 출력
	    	System.out.println("음료번호를 선택하세요");
	    	System.out.println("====================================================================");
			System.out.println("[1.아메리카노(2500)/2.라떼(4500)/3.콜라(1500)/4.홍차(5500)] | 0.종료");
			System.out.println("====================================================================");
			System.out.print("음료 선택 >> ");
			//선택한 번호를 변수에 담기
			beverageChoice = scan.nextInt();
			
			//종료를 선택했을 때 프로그램 종료-
			//주문 종료이면 다른 것을 실행하지 않기 위해 이곳에 선언
			if(beverageChoice==0) {
//				break; // 반복문을 종료
				System.out.println("주문 종료를 선택하여 종료합니다.");
				System.exit(0);//프로그램을 종료
			}//end of if
			
			//주문을 받은 음료의 수량과 가격을 누적하는 메소드 호출
			//매개값(=인자)으로 음료 번호를 넘겨줌
			eachOrder(beverageChoice-1);
			
			//주문을 계속할지 여부 묻기
			System.out.println("주문을 계속하시겠습니까?");
			System.out.println("=============================");
			System.out.println("1.주문 계속 | 2.주문 종료");
			System.out.println("=============================");
			System.out.print("선택 >> ");
			continuingOrNot = scan.nextInt();
			
			//2번 선택시 주문종료
			if(continuingOrNot==2) {
				System.out.println("주문 종료를 선택하여 종료합니다.");
				break;//while문(반복)을 종료
			}//end of if
			System.out.println();
		}//end of while
	    
	    //결과를 출력하는 부분을 작성한 메소드 호출
	    showPrint();
	    
	}//end of main
	
	
	//결제할 금액을 계산하고 주문수량을 계산한 후 출력하기
	public static void showPrint() {
		int totalPaymentAmount=0;//총 주문금액을 담을 변수
	    int totalOrderAmount=0;//총 주문 수량을 담을 변수
	    
	    //금액과 수량을 표시하는 형식을 설정
	    //import java.text.DecimalFormat; 되어야 함
	    DecimalFormat f1 = new DecimalFormat("0잔");//수량패턴 >> 숫자를 문자열로 표시
	    DecimalFormat f2 = new DecimalFormat("#,##0원");//금액패턴 >> 숫자를 문자열로 표시
	    
		//결제할 금액을 계산하고 주문수량을 계산하고 출력하기
	    System.out.println("========================================");
	    System.out.println("음료명\t\t주문수량\t주문금액");
	    System.out.println("========================================");
	    
	    //수량과 개별금액을 출력 배열 공간에 있는 값을 꺼내서 출력
	    //배열은 시작과 끝이 있고, 시작 ~ 끝까지 검토한 후 출력
	    //for문
	    //만약 주문이 없을 시 출력하지 못하게 해야함 : if
	    //         수량이 0이거나 주문금액이 0이면 출력에서 제외
	    for(int a=0; a<beverage.length; a++) {
	    	//음료와 주문 수량, 개별 음료 주문 금액 출력
	    	//한 번도 주문하지 않은 음료는 제외 -> if
	    	if(numberOfOders[a]==0) {
	    		continue;//for의 증감부분으로 돌아감
	    	}//end of if
	    	
	    	//주문이 한번이라도 있는 음료를 출력
	    	System.out.printf("%-10s %8s %10s\n", beverage[a],
	    			f1.format(numberOfOders[a]), f2.format(amountOfMoney[a]));
	    	
	    	//주문 수량 합계 계산
	    	totalOrderAmount += numberOfOders[a];
	    	//결제 금액 총액 계산
	    	totalPaymentAmount += amountOfMoney[a];
	    }//end of for
	    
	    //총 주문수량 합계와 결제금액 총액 출력
	    System.out.println("========================================");
	    System.out.println("주문 수량 합계 : " + f1.format(totalOrderAmount));
	    System.out.println("결제 금액 총액 : " + f2.format(totalPaymentAmount));
	    System.out.println();
	}//end of showPrint
	
	
	//주문을 받아서 개별 계산
	public static void eachOrder(int beverageChoice) {//음료 번호를 매개값으로 넘겨 받았음
		//주문 종료가 아니면 주문 수량 입력 받기
		System.out.print("주문 수량을 입력 >> ");
		int numbers = scan.nextInt();
		
		//선택한 번호를 이용해 음료주문 수량과 금액을 누적하기
			numberOfOders[beverageChoice] += numbers; //주문 수량 누적
//			amountOfMoney[0] = numberOfOders[0]*price[0];
			amountOfMoney[beverageChoice] += numbers*price[beverageChoice];//주문 금액을 누적
		
		System.out.println();
	}//end of eachOrder

}
