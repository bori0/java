package homework;
//요리사 - thread
public class Cook implements Runnable{

	private final Dish dish;
	
	public Cook(Dish dish) {
		this.dish = dish;
	}
	
	private void cooking(int a) throws InterruptedException{
		synchronized (dish) {
			while(!dish.isEmpty()) {
				dish.wait();
			}
			
			dish.setEmpty(false);
			System.out.println(a+" 번 음식 준비됨");
			dish.notify();//wait으로 인해 일시정지 상태인 경우 실행대기 상태로 만들기
		}
	}
	
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			try {
				cooking(i);
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println("예외");
			}
		}
	}
}
