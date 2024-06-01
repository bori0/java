package homework;

public class HJMain {
	
	public static void main(String[] args) {
		System.out.print(" a ");
		
	Runnable a = new HJ();
	Thread b = new Thread(a);
	
	b.setDaemon(true);
	
	b.start();
	for (int i = 0; i < 5; i++) {
		try {
			Thread.sleep(102);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(" B ");
		
	}
	System.out.println(" C ");
}
}
