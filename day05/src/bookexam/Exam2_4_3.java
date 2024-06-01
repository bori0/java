package bookexam;

import java.util.Scanner;

public class Exam2_4_3 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		String name = "";
		String num = "";
		String phone = "";
		
		System.out.println("[필수 정보 입력]");
		System.out.print("이름 입력 >> ");
		name = Scan.nextLine();
		
		System.out.print("주민번호 입력 >> ");
		num = Scan.nextLine();
		
		System.out.print("전화번호 입력 >> ");
		phone = Scan.nextLine();
		
		System.out.println();
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(num);
		System.out.println(phone);
		
		Scan.close(); //scan 닫음		
	}

}
