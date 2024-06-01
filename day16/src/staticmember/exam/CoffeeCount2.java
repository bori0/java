package staticmember.exam;

public class CoffeeCount2 {
	//인스턴스 필드
	   private String beverage;
	   
	   
	  //생성자 - 음료 종류를 입력 받음
	   public CoffeeCount2(String beverage) {
	      //인스턴스 필드는 this 붙임
	      //인스턴스 필드 = 매개변수
	      this.beverage = beverage;
	   
	      
	      //static(=정적필드): 클래스명.필드명
	          CoffeeStaticCount.allCount ++;
	      
	      boolean eq = beverage.equals("커피") || beverage.equalsIgnoreCase("coffee");
	      
	      if(eq) {
	         CoffeeStaticCount.coffeeCount++;
	      } //if 끝
	   }//생성자 끝

	   public String getBeverage() {
	      return beverage;
	   }
	

}//클래스 끝
