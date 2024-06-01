package method;

public class MethodExam01 {

	public static void main(String[] args) {
		int sum = 0;//지역변수, 메인{}안에서만 사용 가능
		//1~5까지의 합
		for(int i=1; i<=5; i++) { //i도 for문 안의 지역변수
			sum+=i;
		}//end of for
		System.out.println("1~5의 합 : " + sum);
		
		
		//1~10까지의 합
		sum = 0;//변수 : 가장 마지막에 저장된 하나의 값만 저장
		for(int i=1; i<=10; i++) {
			sum += i;
		}//end of for
		System.out.println("1~10의 합 : " + sum);
		
		
		//50~100까지의 합
		sum = 0;//int sum은 맨 처음에만 선언하기 때문에 다시 선언하면 안 된다.
		for(int i=50; i<=100; i++) {
			sum += i;
		}//end of for
		System.out.println("50~100의 합 : " + sum);		
		
		
		//35~75까지의 합
		sum = 0;
		for(int i=35; i<=75; i++) {
			sum += i;
		}//end of for
		System.out.println("35~75의 합 : " + sum);			
		
		
	}//end of main

}
