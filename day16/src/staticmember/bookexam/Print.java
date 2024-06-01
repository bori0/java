package staticmember.bookexam;

public class Print {
	//day09 초기 용지(paperNum) : 100    >> static
	// 인쇄방식 : 단면(true)과 양면(false) : int printingMethod  
	//						   인쇄할 매수%2 == 0 >> 인쇄매수/2
	//											1 >> 인쇄매수/2+1
	// 인쇄할 매수를 입력받기(printAmount)    scanner 
	
	// 출력형태
	// 출력된 용지매수 : ~장
	// 남은 용지매수 : ~장
			
	//용지를 출력하려 할 때 1)용지가 없는 경우, 2)용지가 부족, 3)용지가 남는 경우
	//if ~ else if ~ else
	
	//1)static int paperNumber = 100; (private static papaerNumber)
	//2)printShow(int printAmount) >> 출력
	
	//main - prinShow(printAmount, printingMethod) : 프린트할 용지, 프린트 방식(양면, 단면)
	
	
	
	//#1.필드-static
	static int paperNumber = 100;//초기용지
	
	//#2.필드 - 인스턴스 필드
	
	//#3. 생성자
	public Print() {}
	
	//#4. 프린트 할 메소드
	public static void printShow(int printAmount, int printingMethod) {
		//#4-1.양면인쇄
		if(printingMethod == 2) {
		//								인쇄할 용지 매수가 짝수 : 홀수
			printAmount = (printAmount % 2 == 0)? printAmount/2 : printAmount/2+1;
		}
		
		//#4-2. 인쇄처리
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
		}//end of if

	}//end of printShow
	
	//# 용지 매수 충전하기 메소드
	
}
