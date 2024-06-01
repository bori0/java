package bookexam;

import java.awt.Toolkit;

public class BeepPringExam2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i <5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(200);
					}catch(Exception e) {		}//try~catch
				}//for
			}//run
		});//thread

		thread.start();
		
		for (int i = 0; i <5; i++) {
			System.out.println("DDing");
			try {
				Thread.sleep(200);
			}catch(Exception e) {		}//try~catch
		}
	}//main

}
