package conditional;

import java.util.Scanner;

public class SwitchExam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int month = 0;
		
		System.out.println("계절을 알고 싶은 달을 쓰시오 >>");
		month = scan.nextInt();
		
		switch(month) {//문자열 올 수 있다.
			case 12 :
			case 1 :System.exit(0);//프로그램을 강제 종료
			case 2 :
				System.out.println("겨울입니다.");
				break;
			case 3 :
			case 4 :
			case 5 :
				System.out.println("봄입니다.");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("여름입니다.");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("가을입니다.");
				break;
		}
		
		System.out.println("해삐!!");

	}

}
