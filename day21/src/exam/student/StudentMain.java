package exam.student;

public class StudentMain {

	public static void main(String[] args) {
		//#1.객체 생성
		Student hong = new Student("홍길동", "1234");
		
		//#2.생성된 객체 배열에 과목과 점수를 넘겨주기
		hong.subject = new Subject[] {
				new Subject("국어", 80),
				new Subject("영어", 30),
				new Subject("수학", 70)
		};
				
		//과목의 합계와 평균 출력
		hong.showInfo();
		System.out.println();
		
		//과목별 점수
		hong.checkScore();
		System.out.println("-----------------------");
		//#1.객체 생성
		Student kim = new Student("김자바", "456");
				
		//#2.생성된 객체 배열에 과목과 점수를 넘겨주기
		kim.subject = new Subject[] {
				new Subject("국어", 20),
				new Subject("영어", 50),
				new Subject("수학", 90)
		};
				
		//과목의 합계와 평균 출력
		kim.showInfo();
		System.out.println();
				
		//과목별 점수
		kim.checkScore();
	}//end of main

}//end of class
