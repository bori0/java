package homework;

public class Board {
	//#1.필드
	private String subject;
	private String content;
	private String writer;
	
	//#2.생성자
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	//#3.메소드 get/set
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

//	@Override	//Object객체가 가지고 있는 toString()메소드를 재정의 - 주소를 가지고 옴
//	public String toString() {
//		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";

		@Override	//Object객체가 가지고 있는 toString()메소드를 재정의 - 주소를 가지고 옴
		public String toString() {
			return subject+" ,"+ content+", "+ writer;
	}
	
}
