package exceptionexam;

public class ExceptionExam5 {

	public static void main(String[] args) {
		
		//전가 받아 처리하는 경우
		try {
			showA();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	static void showA() throws InterruptedException{ //예외를 떠넘기기 showA를 호출하는 곳으로
			System.out.println("--");
			Thread.sleep(5000);//1000이 1초, 5000 : 5초간 멈춤
			System.out.println("...");
	}

}
