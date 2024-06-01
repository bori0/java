package threadexam2;
//손님 - thread
public class Customer implements Runnable{
	//		final 변수
	private final Dish dish;
	
	//생성자 - 대문자 class Cook = Cook
	//				   Cook cook = new Cook
	public Customer(Dish dish) {
		this.dish=dish;//초기화
	}
	
	//			소문자 =필드
	//(int i) : 음식 종류
	private void eating(int i) throws InterruptedException{
		
		//공유 자원을 동기화 블록 - 요리사와 고객이 음식을 공유하기 때문에 동기화시킴
		//웬만하면 안 쓰는게 좋지만 알아두기
		synchronized (dish) {
			while(dish.isEmpty()) {//빈접시면
				dish.wait(); //기다리라
			}
			
			//음식 있으면 음식을 먹어 접시를 비우면 됨
			dish.setEmpty(true);
			System.out.println(i+"번째 음식을 먹었습니다.");
			dish.notify();//wait()로 인해 일시정지인 상태인 경우 실행대기상태로 만들기
						//요리사에게 음식을 다 먹었다고 통보
		}
	}
	
	//재정의
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {//5가지 요리를 차례대로 먹음
			try {
				eating(i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("ㅇㅖ외");
			}
		}
	}
	
}
