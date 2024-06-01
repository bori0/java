package bookexam;

public class StudentMainExam {
	public static void main(String[] args) {
		//#1. Student 객체 생성 
			//1-1. 홍길동 객체 생성
		Student hong = new Student();
		hong.name = "홍길동";
		hong.age = 20;
		hong.score =70;

		
		//#2. 출력
		//2-1. 홍길동 자료 출력
		System.out.println("이름 : "+hong.name);
		System.out.println("나이 : "+hong.age);
		System.out.println("점수 : "+hong.score);
		System.out.println("=====================");
		
		hong.age =1100;
		hong.score =1000;

		System.out.println("나이 : "+hong.age);
		System.out.println("점수 : "+hong.score);
		
	}//end of main

}//end of class
