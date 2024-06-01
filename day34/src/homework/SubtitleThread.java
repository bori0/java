package homework;

public class SubtitleThread extends Thread{
	//자막을 처리할 클래스
	
	@Override
	public void run() {
		//자막으로 처리할 내용, 멀티 쓰레드에서 실행할 내용
		String[] strSubtitleArray = {"자막1", "자막2","자막3","자막4", "자막5"};
		
		try {
			Thread.sleep(100); 
		} catch (InterruptedException e) {
				e.printStackTrace();
		} 
							
		//#2-2. 자막 실행
		for(int i=0; i<strSubtitleArray.length; i++) {
			System.out.print(strSubtitleArray[i] + " ");
			try {
				Thread.sleep(500); //1000 - 1초,  0.5초 동안 잠시 멈춤
			} catch (InterruptedException e) {
					System.out.println("예외 발생");
			}			
		}
		
	}
	
}
