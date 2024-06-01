package homework;

public class Anonymous {
	public static void main(String[] args) {
		System.out.println("메인쓰레드실행");
		
		Thread runableThread = new Thread(new Runnable() {
			//메모리 안에 객체를 만듦
			//완성시켜 힙에 올리고 쓰레드의 매개값으로 이용
			@Override
			public void run() {
				for (int i = 0; i <5; i++) {
					System.out.print("start ");
					try {
						Thread.sleep(200);
					}catch(Exception e) {
						System.out.println("error");
					}//try~catch
				}//end of for
			}//end of run
		});//end of Thread 매개체 정의
		
		runableThread.start();
		
		//익명 구현 객체
		new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.print("java ");
					try {
						Thread.sleep(200);
					}catch(Exception e) {
						System.out.println("error1");
					}//try~catch
				}//for
			}//run
		}.start(); //Thread
		
		Thread test = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("what");
					try {
						Thread.sleep(200);
					}catch(Exception e) {
						System.out.println("hing");
					}//try~catch
				}//for
			}//run
		};//thread
		
	}//end of main
}
