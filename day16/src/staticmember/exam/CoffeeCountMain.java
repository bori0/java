package staticmember.exam;

public class CoffeeCountMain {

	public static void main(String[] args) {
		CoffeeCount coffee1 = new CoffeeCount("커피");
		CoffeeCount tea1 = new CoffeeCount("녹차");
		CoffeeCount coffee2 = new CoffeeCount("coffee");
		CoffeeCount coke = new CoffeeCount("coke");
		
//		System.out.println("전체 주문 : "+CoffeeCount.allCount);
//		System.out.println("커피 주문 : "+CoffeeCount.coffeeCount);
		
		System.out.println("전체 주문 : "+CoffeeCount.getAllCount());
		System.out.println("커피 주문 : "+CoffeeCount.getCoffeeCount());

	}//end of main

}//end of class
