package staticmember.bookexam;

import java.util.Scanner;

public class PrintExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Print p = new Print();
		
		System.out.print("인쇄 방식 선택 \n [1.단면 / 2.양면] \n 숫자 입력>>");
		int printingMethod = Integer.parseInt(scan.nextLine());
		
		System.out.print("인쇄할 매수 입력 >>");
		int printAmount = Integer.parseInt(scan.nextLine());
		
		Print.printShow(printAmount, printingMethod);
	}

}
