package homework;

public class Jaba extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(103);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("java");
		}
	}
}
