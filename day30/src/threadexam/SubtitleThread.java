package threadexam;

public class SubtitleThread extends Thread{
	//자막을 처리할 클래스
	
	@Override
	public void run() {
		//자막으로 처리할 내용, 멀티 쓰레드에서 실행할 내용
		
		//자막
		String[] strSubtitleArr= {"자막1", "자막2", "자막3","자막4", "자막5"};
		
		try {
			Thread.sleep(100);//자막을 0.1초 늦게 출력되도록 설정
			//멀티 쓰레드는 독립적으로 실행되기 때문에
			//먼저 start()메소드로 호출해도 나중에 실행된 쓰레도보다 늦게 실행될 수 있음
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//자막 실행
		for (int i = 0; i < strSubtitleArr.length; i++) {
			System.out.println(strSubtitleArr[i]);
			
			try {
				Thread.sleep(200);//0.2초 동안 잠시 멈춤
								//1000 : 1초
			} catch (InterruptedException e) {
				System.out.println("예외 발생");
			}//end of try 
		}//end of for
	}
}
