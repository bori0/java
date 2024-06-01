package accessmodifier;

public class GetterSetterExam {
	//#1.필드
	private String id="ooo";
	private String password="___";
	
	
	//#2.기본 생성자 생략 컴파일시 컴퓨터가 알아서 해줄거임
	public GetterSetterExam() {}
	//private으로 선언된 필드 생성자를 통해 초기화
	public GetterSetterExam(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	//#3.메소드
	//getter : private로 선언된 필드를 읽을 수 있음, 읽은 후 넘겨줌
	//		   필드명 앞에 get 붙이고 필드명 첫글자를 대문자
	//		   불린형은 is를 붙이고 필드명의 첫글자를 대문자
	//setter : private로 선언된 필드를 수정
	//		   필드명 앞에 set붙이고 필드명의 첫글자를 대문자
	//		   불린형은 set 필드명의 첫글자를 대문자
	
	
	public String getId() {
		//유효성 검사를 할 수 있음
		return id;//같은 클래스라서 사용 가능
	}
	
	//private로 선언된 메소드 setter을 통해 초기화
	public void setId(String id) {
		this.id = id;
	}
	
	public void show() {
		System.out.println("id : "+id);
	}
}
