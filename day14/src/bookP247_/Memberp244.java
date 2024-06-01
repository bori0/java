package bookP247_;

class Member{//따로 선언하는게 좋으나, 같이 선언해도 됨
	String name;
	String id;
	
	public Member() {}
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
}


public class Memberp244 {//파일이름이랑 같은 것만 public붙을 수 있음

	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member();

	}

}
