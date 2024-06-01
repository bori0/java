package bookexam.inheritance;

public class Parent330 {
	//필드
	public String nation;
	
	//생성자
	public Parent330() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	//메소드
	public Parent330(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}

}
