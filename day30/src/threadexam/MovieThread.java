package threadexam;

public class MovieThread extends Thread{
	
	@Override//Thread 안에 있는 메소드
	public void run() {//멀티 쓰레드로 작업할 내용을 넣기
		//영상 설정
		String[] strVideoArr= {"영상1", "영상2", "영상3", "영상4", "영상5"};		
		//영상 실행
		for (int i = 0; i < strVideoArr.length; i++) {
			System.out.println(strVideoArr[i]);
			
			try {
				Thread.sleep(500);//0.5초 동안 잠시 멈춤
			} catch (InterruptedException e) {
				System.out.println("예외가 발생하였습니다.");
			}//end of try~catch
		}//end of for
	}//end of run

}//end of MovieThread
