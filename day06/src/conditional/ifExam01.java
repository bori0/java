package conditional;

import java.util.Scanner;

public class ifExam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("성적 입력 >>");
		score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score >=80 ) {
			System.out.println("B");
		}else if(score >=70 ) {
			System.out.println("C");
		}else{
			System.out.println("노력 요함");
		}
		
		System.out.println("즐거운 시간!!");
		
		scan.close(); //scan 닫음
	}

}
