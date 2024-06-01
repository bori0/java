package threadexam2;

public class DishThreadMain {

	public static void main(String[] args) {
		final Dish d = new Dish();
		
		new Thread(new Cook(d)).start();
		new Thread(new Customer(d)).start();
	}

}
