package class2;

public class Student3MainExam {

	public static void main(String[] args) {
		//#1. Student2 객체 생성
		Student3 hong;
		hong = new Student3("홍길동", 20, 95);
		Student3 kim = new Student3("김자바", 25, 95);
		
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

		Student3 park = new Student3();
		Student3 kim1 = new Student3(85);
		Student3 han = new Student3("한사랑");
		Student3 im = new Student3("임바다");
		
		System.out.println("park.name : "+park.score);
		System.out.println("kim1.name : "+kim1.score);
		System.out.println("han.name : "+han.name);
		System.out.println("im.name : "+im.name);
		System.out.println("=====================");
		
	}

}
