package exceptionexam;

public class ExceptionExam1 {

	public static void main(String[] args) {
		int a =5;
		int b =0;
		
		try {//예외가 발생할 수 있는 구문을 작성
			System.out.println(a/b);
			
		}catch(Exception e) {//예외 발생시 처리할 구문
			System.out.println("0으로 나눌 수 없습니다.");
			
			System.out.println(e.getMessage());//메세지 출력, / by zero
			
			e.printStackTrace();//예외가 발생한 모든 경로를 알려줌
								//개발 전에 테스팅이나 예외 원인을 알기 위해 사용
								//개발이 끝나면 반드시 지우거나 주석처리 - 보안에 취약해질 수 있음, 로그로 처리
								//java.lang.ArithmeticException: / by zero
								//at exceptionexam.ExceptionExam1.main(ExceptionExam1.java:10)
								//404 500
			
		}

	}

}
