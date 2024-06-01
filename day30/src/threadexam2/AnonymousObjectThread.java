package threadexam2;

public class AnonymousObjectThread {

	public static void main(String[] args) {
		//#1. 메인쓰레드
		System.out.println("메인 부분 실행");

		Thread runableThread = new Thread(new Runnable() {
			//메모리 안에 객체를 만들고/완성시켜 힙에 올리면서/쓰레드의 매개값으로 이용
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.print("Hello ");
					try {
						Thread.sleep(200);//0.2초 동안 멈추기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}//try~catch 끝
				}//end of for
			}//end of run
		});

		runableThread.start();
		
		//익명 구현 객체
		new Thread() {//한 번만 실행하고 끝낼 경우
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("java");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}//try~catch 끝
				}//end of for
			}//end of run
		}.start();
		
		Thread test = new Thread() {//변수로 받는 이유 : 한 번 이상 쓸 경우
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("java");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}//try~catch 끝
				}//end of for
			}//end of run
		};
		
	}//end of main

}
