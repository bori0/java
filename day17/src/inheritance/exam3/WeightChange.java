package inheritance.exam3;

public class WeightChange {
	//필드 - 이름, 몸무게, 키
	//- private(외부에서 접근 불가, 같은 클래스 내에서 접근가능
	//			생성자를 통해 접근가능, 외부에서 접근시 - getter/setter로 접근가능
	private String name;//이름, 인스턴스 변수, 객체가 생성되어야 사용가능
	private double height;//몸무게
	private double weight;//키
	
	//생성자 - WeightChange(이름, 몸무게, 키)
	public WeightChange(String name, double height, double weight){
		super();//부모의 기본 생성자 호출, 생략가능
		this.name = name;//this -자기 자신 객체, this.name -필드, name -지역변수(매개변수)
		this.height = height;
		this.weight = weight;
	}

	//메소드 - getter/setter - private로 선언된 필드를 외부에서 사용할 수 있도록
	
	//메소드 몸무게 변화를 체크 - weightInfo(변화된 몸무게를 받아서 처리)
	public void weightInfo(double weight) {
		
		if(weight==0) {
			System.out.println("몸무게 변화 없습니다.");
			
		 }else if(weight > 0) {
	          //몸무게 증가했을 때,  weight - 매개변수, this.weight - 필드
//	         System.out.println("살이 빠지 전 몸무게 : " + this.weight + "kg 입니다."); 
//	         this.weight += weight;
//	         System.out.println(weight + "만큼 증가해서 현재 " + this.weight + "kg 입니다");
	         
	         //몸무게 증가 처리할 메소드 호출
	         gainWeight(weight);
	         
	      }else {
	         //몸무게 감소했을 때 
	         reduceWeight(weight);
	      }//end of if

	   }//weightInfo 메소드 끝
	
	   public void gainWeight(double weight) {
	      System.out.printf("몸무게 증가전 몸무게 : %.2f kg 입니다.\n" , this.weight ); 
	      this.weight += weight;
	      System.out.printf("%.2f 만큼 증가해서 현재 %.2f kg 입니다", weight, this.weight);
	   }//end of gainWegiht메소드
	   
	   public void reduceWeight(double weight) {
	      System.out.printf("몸무게 감소전 몸무게 : %.2f kg 입니다.\n" , this.weight ); 
//	      this.weight -= Math.abs(weight);//절대값으로 바꿔서 행하는 방법
	      this.weight += weight;
	      System.out.printf("%.2f 만큼 감소해서 현재 %.2f kg 입니다", weight, this.weight);
	   }//end of reduceWeight메소드   
	      
	   public void showMemberInfo() {
	      System.out.println("*** " + name + "님의 건강 정보 ***");
	      System.out.println("키 : " + height + "kg");
	      System.out.printf("몸무게 : %.2f kg\n", weight);      
	   }//end of showMemberInfo메소드 
	   
	}//class 끝
