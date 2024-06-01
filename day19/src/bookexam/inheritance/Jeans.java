package bookexam.inheritance;

public class Jeans extends Item{
	//필드
	private int size;

	//생성자
	public Jeans(String name, int price, int size) {
		super(name, price);
		this.size = size;
	}
	
	//메소드
	@Override
	public void print() {
		System.out.println("**********");
		super.print();//부모 메소드 호출
		System.out.println("사이즈 : "+size);
	}

}
