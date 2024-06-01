package homework;

public class day21_Subject {
	//필드
	String subName;//과목명
	int subjectScore;//과목점수
	
	//생성자
	public day21_Subject(String subName, int subjectScore) {
		super();
		this.subName = subName;
		this.subjectScore = subjectScore;
	}
	
	//메소드
	public void subjectInfo() {
		System.out.println(subName+" : "+subjectScore);
	}
}
