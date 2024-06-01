package homework;

public class Main {

	public static void main(String[] args) {
		System.out.println("메인");
		
		Thread hello = new Hello();
		hello.start();
		
		Thread jaba = new Jaba();
		jaba.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("예외발생");
		}
		System.out.println("----");
		System.out.println("Thread");
			

	}

}
