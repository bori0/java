package homework;

public class Cosmetics extends Item{
	String brand;
	String color;
	
	public Cosmetics(String name, int price, String brand, String color) {
		super(name, price);
		this.brand = brand;
		this.color = color;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("브랜드 : "+brand);
		System.out.println("색상 : "+color);
		
	}
	
}
