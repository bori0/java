package conditional;

import java.util.Scanner;

public class ifExam06 {

	public static void main(String[] args) {
		//#1. Scanner 객체 생성 - 입력을 받기
		Scanner scan = new Scanner(System.in);
		
		//#2.변수 선언
		String jumin = "";
		char genderCheck = ' ';//공백과 - 모두 인식함
		String gender = "";
		
		//#3.안내문구
		System.out.print("주민번호를 입력\n [입력 예시 : 991212-1123123] >>");
		jumin = scan.nextLine();
//		eight = Integer.parseInt(scan.next());
		
		//#4.처리
		//주민번호에서 성별에 
		genderCheck =jumin.charAt(7); //주민번호의 8번째 자리 하나
		                              //인덱스는 0부터 시작하므로
		
		if(genderCheck == '1' || genderCheck == '3') {
			gender = "남";
		}else {
			gender = "여";
		}
		System.out.println(gender);
		

	}

}
