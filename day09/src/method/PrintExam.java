package method;

import java.util.Scanner;

public class PrintExam {
//	public static int paperNumber = 100;
	
	public static void main(String[] args) {
		// 초기 용지(paperNum) : 100              여유로울 때  0일 때    -일 때
		// 인쇄방식 : 단면(true)과 양면(false)    int printingMethod  
		//						   인쇄할 매수%2 == 0 >> 인쇄매수/2
		//											1 >> 인쇄매수/2+1
		// 인쇄할 매수를 입력받기(printAmount)    scanner 
		
		// 출력형태
		// 출력된 용지매수 : ~장
		// 남은 용지매수 : ~장
		
		//용지를 출력하려 할 때 1)용지가 없는 경우, 2)용지가 부족, 3)용지가 남는 경우
		//if ~ else if ~ else
		Scanner scan = new Scanner(System.in);
		System.out.print("인쇄 방식 선택 \n [1.단면 / 2.양면] >>");
		int printingMethod = scan.nextInt();
		
		System.out.println("인쇄할 매수 입력 >>");
		int printAmount = scan.nextInt();
		
		printShow(printAmount, printingMethod);//메소드 호출

	}//end of main
	//						 	 인쇄할 용지 수 , 인쇄방식(양면/단면)
	public static void printShow(int printAmount, int printingMethod) {
								//블록이 달라서 변수를 반복해서 쓸 수 있다.
		int paperNumber = 100; //초기 용지
		
		//양면인쇄
		if(printingMethod == 2) {
			//							인쇄할 용지 매수가 짝수 : 홀수
			printAmount = (printAmount % 2 == 0)? printAmount/2 : printAmount/2+1;
		}
		
		if(paperNumber ==0) {//기본 용지가 없을 때
			System.out.println("용지 없음");
		}else if(paperNumber <printAmount) {//인쇄할 매수가 기본 용지보다 많을 때
			System.out.println("용지 부족 : " + (printAmount-paperNumber));
			System.out.println(paperNumber + "장만 인쇄");
			paperNumber = 0;//기본 용지를 0으로 설정,
			//				  남은 용지를 -로 적을 수 없으므로 0으로 설정해준다.
		}else {
			paperNumber -=printAmount;// 현재 남는 용지 = 초기용지-인쇄할 용지 매수
			System.out.println(printAmount + "장 출력");
			System.out.println("남은 용지 매수 : " + paperNumber);
		}
		
	}

}//end of class