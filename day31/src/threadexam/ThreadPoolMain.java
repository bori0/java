package threadexam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {

	public static void main(String[] args) {
		System.out.println("++ 메인 부분 실행 ++");
		
		Thread runnableThreadPool = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <5; i++) {
					System.out.println("안녕");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("21");
					}//try~catch
				}//for
			}//run
		});//runnable
		
		//Thread pool 생성
		ExecutorService exe = Executors.newCachedThreadPool();
		exe.execute(runnableThreadPool);
		//jvm이 실행
		
		//# 메인 부분 작업
		System.out.println("++ main ++");
		for (int i = 0; i <5; i++) {
			System.out.println("졸린 시간");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("o0o");
			}
		}
		System.out.println("+main 끝");
		
		//#Thread pool 종료
		exe.shutdown();//호출 필수!!되지 않으면 jam이 계속 작업하는걸로 앎
		
	}//main

}//threadpoolmain
