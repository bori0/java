package homework;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int paper =100;
		int page;
		int resPaper;
		
		System.out.println("인쇄할 용지 매수를 입력하세요.");
		System.out.println("인쇄수량>>");
		page = Integer.parseInt(sc.nextLine());
		
		resPaper=paper-page;
		System.out.println("인쇄 : "+page);
		System.out.println("남은 용지 : "+resPaper);
	}

}
