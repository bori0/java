package method;

public class MethodExam03 {

	public static void main(String[] args) {
		//두 정수를 넘겨주고 그 결과를 되돌려 받아서 출력
//		int result = 메소드명 (넘겨줄 숫자1, 2) //메소드 호출
		int result = multipleReturnResult(2, 3);
		System.out.println("두 수의 곱은 :" + result);
		
	}//end of main
	
	
	//메소드를 정의 - 위로부터 두 정수를 넘겨 받아 곱셈을 한 다음 결과를 위로 넘겨주기
	public static int multipleReturnResult(int num1, int num2) { 
		//return 안해주면 ERROR, 넘겨주기로 했잖아 왜 안 넘겨?
		int multipleResult = num1 * num2;
		return multipleResult; //결과 리터(반환), 반환값이 있을 때는 생략할 수 없다.    
	}//end of multipleReturnResult
	
	
	//메소드를 정의 - 출력만 하고 결과는 되돌려 주지 않음
	
}//end or class
