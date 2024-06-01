package inheritance.exam3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
//		Student hong = new Student("홍길동", "24010", 50, 80, 70);
//		hong.scoreCalc();
//		hong.studentInfo();
//
//		System.out.println();
//		Student kim = new Student("김자바", "24110", 70, 90, 30);
//		kim.scoreCalc();
//		kim.studentInfo();
		
		Student[] std={
				new Student("홍길동", "24010", 50, 80, 70),
				new Student("김자바", "24110", 70, 90, 30)
		};

//		for(int a=0; a<std.length; a++) {
//			std[a].scoreCalc();
//			std[a].studentInfo();
//			System.out.println();
//		}
		
		//향상된 for문
		for(Student st : std) {//std가 담고 있는 주소를 st로 하나씩 넘긴다는 의미
			st.scoreCalc();
			st.studentInfo();
		}
	}

}
