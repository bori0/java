package bookexam.inheritance;

public class Book extends Item{
	//필드
	private String author;
	private String publisher;
	
	//생성자
	public Book(String name, int price, String author, String publisher) {
		super(name, price);
		this.author = author;
		this.publisher = publisher;
	}
	
	//메소드
	@Override
	public void print() {
		System.out.println("**********");
		super.print();//부모 메소드 호출
		System.out.println("저자 : "+author);
		System.out.println("출판사 : "+publisher);
	}
}
