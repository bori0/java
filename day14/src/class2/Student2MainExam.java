package class2;

public class Student2MainExam {

	public static void main(String[] args) {
		//#1. Student2 객체 생성
		Student2 hong;
		hong = new Student2("홍길동", 20, 95);
		Student2 kim = new Student2("김자바", 25, 85);
		
		//#2. 출력
		//2-1. 홍길동 자료 출력
		System.out.println("이름 : "+hong.name);
		System.out.println("나이 : "+hong.age);
		System.out.println("점수 : "+hong.score);
		System.out.println("=====================");
				
		//2-2. 김자바 자료 출력
		System.out.println("이름 : "+kim.name);
		System.out.println("나이 : "+kim.age);
		System.out.println("점수 : "+kim.score);

		Student2 park = new Student2();//생성자가 하나라도 있으면 기본생성자만 있을 경우 Error
		//매개변수가 없는 기본 생성자를 찾으려면 없기 때문에 Error
	}

}
