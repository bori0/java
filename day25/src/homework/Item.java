package homework;

public abstract class Item {
	//필드
	private String name;//물건 이름
	private int price;//물건 가격
		
	//생성자
	public Item(String name, int price) {
		super();
		this.name = name;//물건 이름
		this.price = price;//물건 가격
	}
	
	//출력 메소드
	public void show() {//공통으로 출력하는 부분
		System.out.println("이름 : "+name);
		System.out.println("가격 : "+price);
	}

	public String getName() {
		return name;//이름 내보내기
	}

	public int getPrice() {
		return price;//가격 내보내기
	};
	
	
}
