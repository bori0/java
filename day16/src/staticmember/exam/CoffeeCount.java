package staticmember.exam;

public class CoffeeCount {
	//인스턴스 필드
	private String beverage;
	
	//static 필드, private이 붙으면 이 클래스 내에서만 호출해서 사용 가능, 외부클래스에서는 사용불가
	private static int allCount=0;//전체 음료 판매 건수
	private static int coffeeCount=0;//커피 주문 건수
	
	//생성자 - 음료 종류를 입력받음
	public CoffeeCount(String beverage) {
		//인스턴스 필드는 this를 붙임, 인스턴스 필드 = 매개변수
		this.beverage= beverage;
		
		//static = 정적필드
		allCount ++;
		
		boolean eq = beverage.equals("커피") || beverage.equalsIgnoreCase("coffee");
		
		if(eq) {
			coffeeCount++;
		}//end of if
	}//생성자 끝

	//생성자 밑에 getter실행하기
	public String getBeverage() {
		return beverage;
	}

	public static int getAllCount() {
		return allCount;
	}

	public static int getCoffeeCount() {
		return coffeeCount;
	}
	

}//클래스 끝
