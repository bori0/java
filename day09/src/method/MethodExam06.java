package method;

public class MethodExam06 {

	public static void main(String[] args) {
		//문자를 이용해서 비밀번호를 암호화 시키고 다시 복호화(=암호를 푸는) 시키는 문제
		
		String name = "홍길동";
		String password = "ghdrlfehd"; //문자열을 하나 추출 : password.charAt(3)
		String encryptedPassword = "";
		String decryptedPassword = "";
		final int KEY_VALUE = 5;// 선언한 곳에서만 값을 변경 가능
								// 코딩 중 다른 부분의 코드에서는 변경 불가
		
		//정수 + 정수 >> 정수(정수 연산자 정수 >> 정수)
		//정수 연산자 실수 >> 실수
		//문자 + 정수 >> 정수.(자동타입변환), 유니코드로 변경된
		//(char)(문자연산자 (+, -, *, /) 문자+정수)>>문자 : 명시적 타입변환 (=강제형 변환)
		
		//#1.암호화
		//문자열 길이 : 문자열.length() // 몇 글자가 있는지 확인
		//문자 하나 읽어서 *5를 한 코드로 변환 >>(char)(password.charAt(i)*5)
		for(int i=0; i<password.length(); i++) {
			encryptedPassword += (char)(password.charAt(i) * KEY_VALUE);
			//												변수값으로 *5를 상수값으로 정해놓기
		}//end of for 
		System.out.println(password);
		System.out.println(encryptedPassword);
		
		//#3.복호화
		for(int i=0; i<encryptedPassword.length(); i++) {
			decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY_VALUE);//*5를 상수값으로 정해놓기
		}//end of for 
		System.out.println(decryptedPassword);

		
	}//end of main
	

	
	
	
	
}//end or class
