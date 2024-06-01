package bookExam01;

public class Exam161_3 {

	public static void main(String[] args) {
		// While문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을
//		(눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면
//		실행을 멈추는 코드를 작성해보세요
//		눈의 합이 5가 되는 조합은(1, 4)(2, 3)(3, 2)(4, 1)입니다.
		
//		주사위 2번 던지기
//		(int)(Math.random() *6)+1;  1, 2, 3, 4, 5, 6
		
		
		
//		//@ 자주 틀리는 경우
//		int dice1 = (int)(Math.random() *6)+1;//변수를 반복문 밖에 두면 한번만 던진거임
//		int dice2 = (int)(Math.random() *6)+1;
//		
//		while(true) { // 언제 틀릴지 모름, 계속 반복됨
//			System.out.println("("+dice1+", "+dice2+")");
//			System.out.printf("(%d, %d )\n"+dice1, dice2);
//			int result = dice1 +dice2;
//			if(result ==5) {
//				break;
//			}//if의 끝
//			
//		}//while의 끝
		
		
		//@수정해 본다면
		//#1.주사위 던지기
		while(true) { // 언제 틀릴지 모름, 계속 반복됨
			int dice1 = (int)(Math.random() *6)+1;
			int dice2 = (int)(Math.random() *6)+1;
			
//			#3.출력  //마지막 결과가 두 눈의 합이 5
			System.out.println("("+dice1+", "+dice2+")");
			
			//#2.조건
			int result = dice1 +dice2;
			if(result ==5) {
				break;
			}//if의 끝
			
//			//#3.출력  //마지막 결과의 두 눈의 합이 5가 아님
//			System.out.println("("+dice1+", "+dice2+")"); 
			
		}//while의 끝

	}

}
