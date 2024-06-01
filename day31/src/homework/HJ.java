package homework;

import static homework.Test.*;

public class HJ implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print("D");
			Test.sleep(500);
			System.out.println("E");
			sleep(300);
		}
		Test t= new Test();
		t.sleep(410);
	}
	
}
