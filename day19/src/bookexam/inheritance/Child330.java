package bookexam.inheritance;

public class Child330 extends Parent330 {
	//필드
	private String name;
	
	//생성자
	public Child330() {
//		super();// 1)언제나 부모 클래스 먼저 가야함!!
		this("홍길동");//2)적용은 나중에
		System.out.println("Child() call");
	}
	
	public Child330 (String name) {
		this.name = name;
		System.out.println("Child(String name) call");
		
	}

}
