package bookexam;

public class BeepPringExam4 {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for (int i = 0; i <5; i++) {
			System.out.println("ding");
			try {
				Thread.sleep(200);
			}catch(Exception e) {}
		}

	}

}
