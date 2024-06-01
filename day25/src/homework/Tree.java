package homework;

public class Tree implements Countable{
	//필드
	String name;
	
	//생성자
	public Tree(String name) {
		super();
		this.name = name;
	}

	//메소드
	public void ripen() {
		System.out.println(name+"에 열매가 잘 익었다");
	};
	
	//재정의
	@Override
	public void count() {
		System.out.println(name+"가 2그루 있다.");
		
	}
}
