package homework;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[2];
		int sum=0;
		for (int i = 0; i < score.length; i++) {
			System.out.println("국어, 영어, 성적입력 >>");
			score[i] =Integer.parseInt(sc.nextLine());
		}
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		double avg =sum/score.length;
		
		System.out.println(sum);
		System.out.printf("%.2f",avg);

	}

}
