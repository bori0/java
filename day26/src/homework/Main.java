package homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exam e =new Exam(); 
		
		int[] num= new int[2];
		System.out.println("숫자를 입력 >>");
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
			
		}
		e.add(num[0], num[1]);
		e.multiple(num[0], num[1]);
	}

}
