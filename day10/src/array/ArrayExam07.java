package array;

import java.util.Scanner;

public class ArrayExam07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//변수 
		String[] names = new String[3];
		int[] scores = new int[3];
		int sum=0;
		int avg = 0;
		
		//입력받기
		for(int i=0; i<names.length; i++) {
			System.out.print("이름 입력 >> ");
			names[i] = scan.nextLine();
			
			System.out.print("성적 입력 >> ");
//			scores[i] = scan.nextInt();
			scores[i] = Integer.parseInt(scan.nextLine());
			
		}//end of for
		
		for(int i=0; i<names.length; i++) {
			sum += scores[i];	
		}	
		avg = sum/3;
		
		//출력하기
		for(int i=0; i<names.length; i++) {
			System.out.println("--------------------");
			System.out.println("학생 이름 : " +names[i]);
			System.out.println("성적 : " + scores[i]);
		}//end of for

		System.out.println("--------------------");
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	
	}//end of main

}
