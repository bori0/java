package array;

import java.util.Scanner;

public class ArrayExam08 {

	public static void main(String[] args) {
		//윤년구하기
		Scanner scan = new Scanner(System.in);
		
		int year = 0;
		String result = "";
		
		System.out.print("알아보고 싶은 달 >>");
		year = scan.nextInt();
		
		result = (year%400 ==0 || (year%4==0 && year%100 !=0))? "윤년" : "평년";
		
		System.out.println("당신의 달은 : "+result);

	}

}
