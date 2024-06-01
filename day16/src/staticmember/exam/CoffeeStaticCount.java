package staticmember.exam;

public class CoffeeStaticCount {
	static int allCount=0;
	static int coffeeCount=0;
//	int allCount=0; //인스턴스 필드, 객체를 생성해야 사용가능
//	int coffeeCount=0;
	
//	public int getAllCount() {
//		return allCount;
//	}
//	public int getCoffeeCount() {
//		return coffeeCount;
//	}
	
	//private + 생성자 : 외부에서는 객체를 생성불가 
	private CoffeeStaticCount() {};
	
}
