package array;

import java.util.Scanner;

public class Exam_2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//
		
		int studentCount = 0;
		int[] score = null;
		boolean run = true;
		
		while(run) {
			System.out.println("=======================================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("=======================================================");
			System.out.print("번호 선택 >> ");
			int selectNo = scan.nextInt();
			
			if(selectNo==1) {
				System.out.print("학생수>>");
				studentCount = scan.nextInt();
			}//end of if
			if(selectNo==2) {
				score = new int[studentCount]; 
				add(score);
			}else if(selectNo==3) {
				for(int a = 0; a<score.length; a++) {
					System.out.println(score[a]);
				}
			}else if(selectNo==4) {
				int sum = 0;
				double avg = 0.0;
				int max = score[0];
				int min = score[0];
				
				for(int a = 0; a<score.length; a++) {
					sum += score[a];
					
					if(max<score[a]) {
						max = score[a];
					}//end of if
					if(min>score[a]) {
						min = score[a];
					}//end of if
				}//end of for
				avg = (double)sum/score.length;
				
				System.out.println(sum);
				System.out.printf("평균 : %.2f\n", avg);
				System.out.println(max);
				System.out.println(min);
			}else if(selectNo==5) {
				run = false;
			}//end of if
		}//end of while
		System.out.println("종료");
	}//end of main

	public static void add(int[] score) {
		for(int a = 0; a<score.length; a++) {
			System.out.print((a+1)+"번 학생 점수 입력>>");
			score[a] = scan.nextInt();
		}//end of for
	}

}
