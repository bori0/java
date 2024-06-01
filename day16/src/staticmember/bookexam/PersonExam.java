package staticmember.bookexam;

public class PersonExam {

	public static void main(String[] args) {
		Person p1 = new Person("123", "홍");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
//		p1.test= 30; //person에서 값이 넣어지든 안 넣어지는 ERROR
					 //final static으로 이미 선언과 동시에 초기화 되었으므로
//		Person.test = 30;//이미 선언과 동시에 초기화되어 있는 상수이므로 final static임
		
//		p1.nation = "usa";//nation이 final이라 초기화시킨 후 값을 변경 못 함
//		p1.ssn = "456";//
		p1.name = "김";//인스턴스 필드 - 언제든 변경 가능
		
		
		Person p2 = new Person("789", "이");
		//final 객체는 자기 객체에서는 한번 밖에 선언이 안 됨
		//새로운 객체를 만드는건 또다른 거기 때문에 가능

		System.out.println(p2.nation);
		System.out.println(p2.ssn);
		System.out.println(p2.name);
	}

}
