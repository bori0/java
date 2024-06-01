package threadexam;

public class TheNeedForThread {

	public static void main(String[] args) {
		//#1. thread가 단일 쓰레드일 경우
		
		//영상
		String[] strVideoArr= {"영상1", "영상2", "영상3", "영상4", "영상5"};
		
		//자막
		String[] strSubtitleArr= {"자막1", "자막2", "자막3","자막4", "자막5"};
		
		//영상실행
		for (int i = 0; i < strVideoArr.length; i++) {
			System.out.println("비디오 장면 : "+strVideoArr[i]);
			
			try {
				Thread.sleep(200);//0.2초 동안 잠시 멈춤
								//1000 : 1초
			} catch (InterruptedException e) {
				e.printStackTrace();//개발이 완료된 후에는 반드시 삭제 또는 주석처리
			}//end of try 
		}//end of for
		
		for (int i = 0; i < strSubtitleArr.length; i++) {
			System.out.println("비디오 자막 : "+strSubtitleArr[i]);
			
			try {
				Thread.sleep(200);//0.2초 동안 잠시 멈춤
								//1000 : 1초
			} catch (InterruptedException e) {
				e.printStackTrace();//개발이 완료된 후에는 반드시 삭제 또는 주석처리
			}//end of try 
		}//end of for
		
	}//end of main

}
