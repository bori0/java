package bookexam;

import java.awt.Toolkit;

public class BeepPrintExam5 {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(100);
					}catch(Exception e) {}
				}//for
			}//run
		};//thread
		thread.start();
		
		for (int i = 0; i <5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(100);
			}catch(Exception e) {}
		}
	}//main

}
