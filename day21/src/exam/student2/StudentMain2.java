package exam.student2;

public class StudentMain2 {

	public static void main(String[] args) {
		//#1.객체 생성
		Student2 hong = new Student2("홍길동", "1234", 2);
		
		hong.addSubject("국어", 80);
		hong.addSubject("영어", 30);
		
		//#2.생성된 객체 배열에 과목과 점수를 넘겨주기
		hong.subject = new Subject[] {
				new Subject("국어", 80),
				new Subject("영어", 30),
				new Subject("수학", 70)
		};
				
		//과목의 합계와 평균 출력
		hong.show();
		System.out.println();
		
		//과목별 점수
		hong.checkScore();
		
	}//end of main

}//end of class
