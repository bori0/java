package staticmember.bookexam;

public class Person {
	//#1.인스턴스 필드
	final String nation="Korea";//final 필드
//	final static String NATION = "Korea"; //상수
	final static int test = 10;//클래스 영역에 생성, 자기 영역에서 한번만!!선언과 동시에 초기화
//	final static int test ;//이렇게 적고 생성자에 추가로 적는건 안 됨
	final String ssn;
	String name;
	
	//#2.생성자
	public Person(String ssn, String name) {
		super();
//		test =10;//따로 선언 불가
		this.ssn = ssn;
		this.name = name;
	}
	
	public Person(String nation, String ssn, String name) {
//		this.nation =nation; //위에서 초기화를 한 번 시켰기 때문에 더이상 초기화 불가
							 //선언과 동시에 초기화 되어 변경할 수 없음
		this.ssn = ssn;
		this.name = name;
	}
}