package homework;

public class Hello extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("Hello ");
		}
	}
}
