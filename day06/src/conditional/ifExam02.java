package conditional;

import java.util.Scanner;

public class ifExam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int point = 0;
		String result = "";//char ch = ' ';
		//기본타입 : 값을 담고 있음
		//참조타입 : 주소를 담고 있음
		
		System.out.println("회원 포인트를 입력 >> ");
		point = scan.nextInt();
		//point = Integer.parseInt(scan.next());
		
		if(point>=20) {
			result = "VIP";
		}else if(point>=10) {
			result = "GOLD";
		}else {
			result = "일반 회원";
		}
		System.out.println("당신의 등급은 " + result + "입니다.");
		
		scan.close(); //scan 닫음

	}

}
