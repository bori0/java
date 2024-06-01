package homework;

public class CreateAndStartThreadExam01 {
	public static void main(String[] args){
		
		//#1. 메인쓰레드 부분 
		System.out.println("메인 쓰레드 실행....");
		System.out.println("즐거운 시간....");
		
		//#2.자막 쓰레드 생성
		SubtitleThread st = new SubtitleThread(); 
		//#2-1. 자막 쓰레드 실행
		st.run();
	}
}
