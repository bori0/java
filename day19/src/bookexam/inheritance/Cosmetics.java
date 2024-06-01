package bookexam.inheritance;

public class Cosmetics extends Item{
	//#1.인스턴스 필드 - 되도록이면 외부노출되지 않도록 private로 선언
	private String brand;
	private String color;
	
	//#2.생성자 - 부모 생성자를 호출
	//부모를 초기화시킬 필드값과 자신을 초기화시킬 필드값을 매개변수로 받을 수 있도록 설정
	public Cosmetics(String name, int price, String brand, String color) {
		super(name, price);
		this.brand = brand;
		this.color = color;
	}
	//#3.메소드 - 출력을 위한 메소드 필요
	//			  부모의 print() 메소드 호출하여 자식의 출력내용을 추가
	@Override
	public void print() {
		System.out.println("**********");
		super.print();//부모 메소드 호출
		System.out.println("브랜드 : "+brand);
		System.out.println("색상 : "+color);
	}
	

}
