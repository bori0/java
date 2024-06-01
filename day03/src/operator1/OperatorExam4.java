package operator1;

public class OperatorExam4 {

	public static void main(String[] args) {		
		//#1.변수 선언
		int number=5; //숫자 
		String result=""; // 문자열을 초기화
//		char test=' ';// 문자는 한칸 띄어야 초기화
		
		//#2. 삼항 연산자 활용
		//(조건)? 조건의 결과가 참일 때 실행 문장 : 거짓일 때 실행 문장
		
		result =(number%2==1)? "A팀" : "B팀";
		
		System.out.println(result);
		System.out.println();
		
		
		
//		//#1.변수 선언
//		int score=55;
//		String result1="";
//		
//		//#2.삼항 연산자 활용
//		result1=(score>=80)? "합격" : "불합격";
//		
//		//#3.출력
//		System.out.println(result1);
//		System.out.println();
		
		int score =55;
		result = (score>=80)? "합격" : "불합격";
		//result는 변수로 변할 수 있기 때문에 중복해서 써도 된다.
		System.out.println(result);

	}

}
