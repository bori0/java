package collectionexam;

public class Board {
	//인스턴스 필드 - 객체(=인스턴스)를 생성해야지만 사용할 수 있다.
	private String subject;
	private String content;
	private String writter;
	
	//생성자 - 객체를 초기화 >> new Board(); >> 힙에다 객체를 생성하겠다
//	public Board() {} //기본 생성자 //외부에서 마음대로 생성할 수 있다.
	//객체를 외부에서 생성하지 못하게 할 경우:	singleton : 객체를 딱 하나만 가질 수 있다.
//	private Board() {}
	//protected 패키지 안에서는 마음대로 가능, 다른 패키지에서는 자식들만 사용 가능
	public Board(String subject, String content, String writter) {
		super();//Board 클래스는 Object를 상속받고 있기 때문에
		this.subject = subject;
		this.content = content;
		this.writter = writter;
	}

	//메소드
	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public String getWritter() {
		return writter;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}

	@Override
	public String toString() {
		return subject + ", " + content + ", " + writter+"\n";
		
	}
	
	
	
}
