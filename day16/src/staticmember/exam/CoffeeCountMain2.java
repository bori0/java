package staticmember.exam;

public class CoffeeCountMain2 {

	public static void main(String[] args) {
		//객체 생성
		CoffeeCount2 coffee1 = new CoffeeCount2("커피");
		CoffeeCount2 tea1 = new CoffeeCount2("녹차");
		CoffeeCount2 coke = new CoffeeCount2("콜라");
		CoffeeCount2 coffee2 = new CoffeeCount2("coffee");
		CoffeeCount2 coke1 = new CoffeeCount2("coke");

		//확인
		//static(정적)필드
		System.out.println("전체 판매 : "+CoffeeStaticCount.allCount);		
		System.out.println("커피 판매 : "+CoffeeStaticCount.coffeeCount);		
		
		
		
	}

}
