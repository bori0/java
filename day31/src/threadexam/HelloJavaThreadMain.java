package threadexam;

public class HelloJavaThreadMain {

	public static void main(String[] args) {
		System.out.println("++ Main Thread ++");
		
		//#1.thread 객체 생성
		Runnable h=new HelloJavaThread();
		Thread ht = new Thread(h);
		
		//데몬쓰레드 설정
		ht.setDaemon(true);
		
		//Thread실행
		ht.start();
		
		//#main thread 작업
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				System.out.println("예외 처리");
			}
			System.out.println(" java ");
		}
		System.out.println("++main thread 종료++");
	}

}
