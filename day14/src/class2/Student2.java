package class2;

public class Student2 {
	//#1.필드 //객체가 만들어지기 전까지 쓸 수 없다.
	String name;
	int age;
	int score;
	
	//#2.생성자
	public Student2() {
		name = "홍길동";
		age = 20;
		score = 85;
	}//기본 생성자
	//기본생성자는 다른 생성자가 하나라도 있으면
	//컴파일러가가 자동으로 생성자를 만들기 않기 때문에 기본생성자는 생략하면 안 됨
	//사용하지 않는건 상관없는데 사용할 경우!

	public Student2(String name, int age, int score) {//()안에 들어는 건 지역변수
		//생성자를 통한 초기화//재료를 만드는 시점에서 생성자를 준다
		//필드와 지역변수가 같으면 제일 가까운 ()괄호의 변수를 사용한다.
		//필드, 인스턴스 = 지역 변수(넘어온 값)
		//필드와 지역변수 구분이 필요해서, this.(자신의 객체)을 붙인다. 써주는게 좋다
		this.name =name; // this.name : 필드
		this.age =age;
		this.score =score;
	}//생성자 오버로딩
	//이름이 같고, 매개변수의 타입이 다르거나 개수가 다르면  : 오버로딩
	
	//메소드를 찾아올 때 매개변수 타입, 개수를 찾아 가는 것
	
	//#3.메소드
	
}
