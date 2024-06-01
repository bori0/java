package exceptionexam;

public class ExceptionExam4 {

	public static void main(String[] args) {
		//예외 직접 처리하는 경우
		showA();

	}
	static void showA() {
		try {
			System.out.println("--");
			Thread.sleep(5000);//1000이 1초, 5000 : 5초간 멈춤
			System.out.println("...");
		}catch(InterruptedException e){//일반 일처리하다가 위급한 것 먼저 처리한 다음 다시 일반 일처리
			e.printStackTrace();
		}
	}

}
