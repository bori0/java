package bookexam;

public class BeepPringExam {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for (int i = 0; i <5; i++) {
			System.out.println("띵");
			try {
				thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}
