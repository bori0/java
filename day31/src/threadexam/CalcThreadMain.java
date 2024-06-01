package threadexam;

public class CalcThreadMain {

	public static void main(String[] args) {
		System.out.println("main");
		
		CalcThread cal = new CalcThread();
		cal.start();
		
		try {
			cal.join();//cal 계산이 끝날 때까지 멈추는 상태
		} catch (InterruptedException e) {
			System.out.println("ㅇㅖ외");
		}
		
		System.out.println("1~100까지 합 : "+cal.getSum());//join 없으면 0으로 나옴
								//위에서 계산 중인데 출력하라고 나오면 초기화값으로 나옴
		
	}

}
