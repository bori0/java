package listexam;

public class Board {
	String subject;
	String content;
	String writter;
	
	public Board(String subject, String content, String writter) {
		this.subject = subject;
		this.content = content;
		this.writter = writter;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public String getWritter() {
		return writter;
	}
	
	public void show() {
		System.out.print(" 제목 : "+subject);
		System.out.print(" 내용 : "+content);
		System.out.println(" 작가 : "+writter);
	};
	
	
	

}
