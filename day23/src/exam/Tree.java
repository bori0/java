package exam;

public class Tree implements Countable{
	String name;
	
	public Tree(String name) {
		this.name = name;
	}
	
	@Override
	public void count() {
		System.out.println(name+"가 5그루 있다.");
		
	}
	
	void ripen() {
		System.out.println(name+"에 열매가 잘 익었다.");
	};

}
