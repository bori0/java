package homework;

public class DishThreadMain {

	public static void main(String[] args) {
		final Dish a = new Dish();
		
		new Thread(new Cook(a)).start();
		new Thread(new Customer(a)).start();
	}

}
