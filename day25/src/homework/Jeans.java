package homework;

public class Jeans extends Item{
	int size;

	public Jeans(String name, int price, int size) {
		super(name, price);
		this.size = size;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("사이즈 : "+size);
		}
	
	
}
