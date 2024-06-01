package homework;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//for버전
//		for (int i = 1; i <=3; i++) {
//		String name;
//		int score;
//			System.out.println("이름과 점수를 입력");
//			System.out.print("이름 >>");
//			name = sc.nextLine();
//			System.out.print("점수 >>");
//			score = Integer.parseInt(sc.nextLine());
//		}
//		System.out.println();
//		System.out.println(i+"번째 입력 : "+name +", "+score);
		
		
		
		//while버전
		int i=1;
		String name="";
		int score=0;

		while(i<=3) {
			
			System.out.print("이름입력");
			name = sc.nextLine();
			
			System.out.print("점수");
			score = Integer.parseInt(sc.nextLine());
			
			System.out.print(i+name+score);
			i++;
		}
			
		
		
		//배열버전
//		String[] name=new String[3];
//		int[] score = new int[3];
//		
//		for (int j = 0; j <3; j++) {
//			System.out.println();
//			System.out.println("이름과 점수를 입력");
//			System.out.print("이름 >>");
//			name[j] = sc.nextLine();
//			System.out.print("점수 >>");
//			score[j] = Integer.parseInt(sc.nextLine());
//			
//		}
//		for (int a = 0; a <3; a++) {
//			System.out.println(a+name[a]+score[a]);
//		}
		
	}
}
