package exam.student3;

public class StudentArryListMain {

	public static void main(String[] args) {
		
		Student hong = new Student("홍길동", "123");
		hong.addSubject("국어",70);
		hong.addSubject("수학",30);
		hong.addSubject("영어",10);
		
		hong.showInfo();
		hong.checkScore();
		System.out.println("-----");
		
		Student kim = new Student("김씨", "456");
		kim.addSubject("국어",70);
		kim.addSubject("수학",60);
		kim.addSubject("영어",50);
		
		kim.showInfo();
		kim.checkScore();
		
	}
}
