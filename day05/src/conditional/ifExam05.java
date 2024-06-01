package conditional;

import java.util.Scanner;

public class ifExam05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("숫자 입력 >> ");
		num = scan.nextInt();
		
		if(num != 3) {
			System.out.println("입력한 숫자는 '3'이 아닙니다.");
			System.out.println("입력한 숫자는 " + num + "입니다.");
		}
		
		scan.close(); //scan 닫음
	}

}
