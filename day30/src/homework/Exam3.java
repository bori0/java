package homework;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자>>");
		int num = sc.nextInt();
		String result="";
		
		result=(num>0)? "양수":(num<0)?"음수":"0";
		System.out.println(result);
	}
	
}
