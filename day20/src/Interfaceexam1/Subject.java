package Interfaceexam1;

public class Subject {
	/* 과목 클래스 생성 - Subject
			과목명 : String subjectName
			과목점수 : int subScore
			과목명 : 점수 >> subjectInfo()
			생성자 Subject(String subjectName, int subScore)*/
	
	
	//#1.필드
	String subjectName;//과목명
	int subScore;//과목 점수
	
	//#2.생성자
	public Subject(String subjectName, int subScore) {
		this.subjectName = subjectName;
		this.subScore =subScore;
	}
	
	//#3.메소드 - 수강과목 : 점수 출력
	public void subjectInfo() {
		System.out.println(subjectName+" : "+subScore);
	}

}
