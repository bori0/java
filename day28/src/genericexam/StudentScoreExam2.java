package genericexam;

public class StudentScoreExam2 {

	public static void main(String[] args) {
//이름, 영어 성적을 보고 최고 점수를 출력하는 프로그램
//영어 성적을 비교하는 클래스(EnglishScore)
//성적을 비교, 이름과 점수를 출력할 수 있도록 toString()
//학생  : {홍길동, 90}{우영우, 89}{최수연, 90}{이준호, 67}{김자바, 48}
		//값을 넣을 수 없어서 객체를 만들어 (매개값)으로 넣음
//실행클래스 - 최고 점수를 찾는 메소드 findBest(EnglishScore[] a)
//영어성적을 비교하는 클래스 - EnglishScore
		
		EnglishScore[] engArr = {
				new EnglishScore("홍길동", 70),
				new EnglishScore("우영우", 89),
				new EnglishScore("최수연", 90),
				new EnglishScore("이준호", 67),
				new EnglishScore("김자바", 48)
				
		};
		
		MathScore[] matArr= {
				new MathScore("홍길동", 74),
				new MathScore("우영우", 69),
				new MathScore("최수연", 98),
				new MathScore("이준호", 61),
				new MathScore("김자바", 47)	
		};
		
		//최고점수를 찾는 메소드를 호출해서 출력
		System.out.println("영어 최고 점수 : "+findBest(engArr));
		System.out.println("수학 최고점 : "+findBest(matArr));
		
//학생들이 소프트웨어 시험을 봄 최고 점수를 받은 학생의 이름과 점수를 출력하는 프로그램을 작성

	}//end of main
	
	//최고 점수를 찾는 메소드
	static <T extends Comparable<T>> T findBest (T[] a) {
		T max = a[0];//최고 점수 찾기
		
		for (int i = 0; i < a.length; i++) {
			if(max.compareTo(a[i])<0) {
	//얘를 받는 부모의 범위를 정해주면 Error없음
				max=a[i];
			}//end of if
		}//end of for
		
		return max;
		}//end of findBest

}
