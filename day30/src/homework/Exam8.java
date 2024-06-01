package homework;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor=0;
		int eng=0;
		int mat=0;
		String result = "";
		double avg = 0.0;
		
		System.out.println("국영수 시험점수 >>");
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
		int sum = kor+eng+mat;
		avg =sum/3.0;
		
		boolean res = (kor>=40 && eng>=40 && mat>=40 && avg>=60);
		
		if(res) {
			result = "통과";
		}else {
			result = "탈락";
		}
		System.out.println(result);
		
		boolean res1 = !(kor<40 || eng<40 || mat <40)&& avg>=60;
		if(res1) {
			result = "통과";
		}else {
			result = "탈락";
		}
		System.out.println(result);
	}

}
