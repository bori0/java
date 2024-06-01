package threadexam3;

public class CreateAndStartDaemonThread {

	public static void main(String[] args) {
		//#1. 메인 쓰레드
		System.out.println("++메인 쓰레드 실행++");
		
//		//쓰레드 객체 생성 및 실행
//		Runnable daemonThread = new TestDaemon();
//		Thread daemonTh = new Thread(daemonThread);
//		daemonTh.start();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			System.out.println("쓰레드 예외 발생");
//		}
//		
//		System.out.println("++메인 쓰레드 종료++");
		
		//쓰레드 객체 생성 및 실행
		Runnable daemonThread = new TestDaemon();
		Thread daemonTh = new Thread(daemonThread);
		daemonTh.setDaemon(true);//데몬 쓰레드로 설정
								//주의 : start() 보다 앞에 선언
		daemonTh.start();//Thread 실행
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("쓰레드 예외 발생");
		}
		
		System.out.println("++메인 쓰레드 종료++");
	}

}
