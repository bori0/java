package threadexam;

public class Test {
	public static void sleepShow(long num) {
		
		try {//지연 시간
			Thread.sleep(num);//static 메소드가 되는 것
		} catch (InterruptedException e) {
			System.out.println("예외");
		}//end of try~catch
	}//end of sleepShow
	
}
