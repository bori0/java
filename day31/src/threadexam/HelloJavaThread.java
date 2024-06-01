package threadexam;

import static threadexam.Test.*;

public class HelloJavaThread implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			//#1. test클래스.메소드명
			Test.sleepShow(500);
			
			//#2. 클래스가 너무 길어서 쓰기 불편할 경우
			//import static 패키지명.클래스명 *
			//클래스의 모든 것을 가져오겠다는 의미
			sleepShow(300);
			
			System.out.println("happy?happy!");
		}
		
		//#3. 객체 생성해서 호출
		Test t= new Test();
		t.sleepShow(1000);
		
	}//extends Thread

	//클래스이름.sleepShow();
	//이렇게 사용할 수 있음, 클래스 안에 속하기 때문
//	public static void sleepShow(long num) {
//		
//		try {//지연 시간
//			Thread.sleep(num);//static 메소드가 되는 것
//		} catch (InterruptedException e) {
//			System.out.println("예외");
//		}//end of try~catch
//	}//end of sleepShow

}//end of class
