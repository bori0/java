package variable1;

public class VariableExam04 {

	public static void main(String[] args) {
		// 타입 변수명 = 초기값;
		int number; //변수를 선언(메모리에 정수값을 담을 그릇을 만든다고 선언)
		number=10; //초기값
				//int number=10; 값을 모를경우 0으로 적기!!!
		//number=10;
		//int number=10;
		
		System.out.println("1. number 초기값 :"+ number); //1. number 초기값 :10
		System.out.println("===========================");
		
		number=35;
		System.out.println("2. number 변경값 :"+ number); //2. number 변경값 :35
		System.out.println("==========================="); 
		
		number=7;
		System.out.println("3. number 변경값 :"+ number);
		System.out.println("==========================="); 
		
		/*변수는 반드시 초기화 시켜야함
		int score;
		int result=0;
		
		result = score +10; //score를 초기화하지 않아 에러 발생
		System.out.println("score="+score);
		System.out.println("result="+result);
		*/
		
		int score=7;
		int result=0;
		
		result = score +10; //score를 초기화하지 않아 에러 발생
		                    //=을 만나면 무조건 오른쪽부터 보기!!
		System.out.println("score="+score);
		System.out.println("result="+result);
		
		//double score=5.2; //score 2번 쓰면 에러뜸
		                    //변수명은 한번 선언되면 또다시 선언할 수 없음
		
		
	}

}
