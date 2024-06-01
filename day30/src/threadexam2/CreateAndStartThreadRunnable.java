package threadexam2;

public class CreateAndStartThreadRunnable {

	public static void main(String[] args) {
		//#1. main Thread
		System.out.println("main thread ");
		
		//#2. 영상 쓰레드 객체 생성 및 실행
//		Runnable movieRunnable = new MovieRunnable();
//		Thread moviThread = new Thread(movieRunnable);
												//다중 상속이 안 되기 때문에 이렇게 써야함
		
		Thread moviThread = new Thread(new MovieRunnable());//한 번 쓸거라 이렇게 써도 됨
		
		moviThread.start();
		
		
		//#3. 자막 쓰레드 객체 생성 및 실행
		Runnable subtitleRunnable = new SubtitleRunnable();
		Thread subtitleThread = new Thread(subtitleRunnable);
		subtitleThread.start();
		
		//#4. 메인 쓰레드 부분
		try {
			Thread.sleep(3000);//5초간 작업을 멈춤
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("===========");
		System.out.println("메인 부분");

	}

}
