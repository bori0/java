package exam.student2;

public class Subject {
	//#1.필드
	String subjectName;//과목명
	int subjectScore;//과목점수
	
	//#2.생성자
	public Subject(String subjectName, int subjectScore) {
		this.subjectName = subjectName;
		this.subjectScore = subjectScore;
	}
	
	//#.메소드
	public void subjectInfo() {
		System.out.println(subjectName+" : "+subjectScore);
	}
	
}
