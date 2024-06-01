package scanner;

import java.util.Scanner;

//import java.util.Scanner; //붕어빵틀, 미리 적어놔야 밑에 scanner에서 자유롭게 쓸 수 있음
// 컴퓨터가 미리 불러온다
public class ScannerExam01 {

	public static void main(String[] args) {
		//#1.스캐너라는 클래스를 사용해서 스캐너 객체를 생성
		Scanner scan = new Scanner(System.in); //close scan써야함
		//scanner가 없어서 찾을 수 없다.
		//Ctrl Shift O =>자동으로 import불러줌
		
		//#2.변수 선언
		String name ="";
		int kor = 0;
		double avg = 0.0;
		
		//#3.안내문구
		System.out.print("이름을 입력  >>");
		//#4.객체에 담긴 값을 읽어오기
		name = scan.nextLine(); //scan이 가리키는 곳(주소)에 가서 문자열을 가져오기
		
		System.out.print("국어점수 입력 >>");
		kor = scan.nextInt();//scan이 가리키는 곳(주소)에 가서 정수를 가져와서 kor 변수에 담아
		
		System.out.println("평균을 입력 >>");
		avg = scan.nextDouble();
		
		System.out.println(name);
		System.out.println(kor);
		System.out.println(avg);

	}

}
