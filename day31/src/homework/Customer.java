package homework;
//손님 - thread
public class Customer implements Runnable{

	private final Dish dish;
	
	public Customer(Dish dish) {
		this.dish = dish;
	}
	
	private void eating(int a) throws InterruptedException{
		synchronized (dish) {
			while(dish.isEmpty()) {
				dish.wait();
			}
			
			dish.setEmpty(true);
			System.out.println(a+" 번 음식 먹음");
			dish.notify();//wait으로 인해 일시정지 상태인 경우 실행대기 상태로 만들기
		}
	}
	
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			try {
				eating(i);
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println("예외");
			}
		}
	}
}
