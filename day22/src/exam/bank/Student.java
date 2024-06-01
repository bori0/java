package exam.bank;

import java.util.Iterator;
import java.util.Scanner;

public class Student {
private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//#1.학생 수 입력받아 배열 공간 확보
		System.out.println("학생 수를 입력 >>");
		int studentNumber = Integer.parseInt(scan.nextLine());//학생 수
		
		//배열공간을 확보//학생 이름
		String[][] name = new String[studentNumber][2];//행은 학생 수만큼 열 2개
		
		//db, sw, pg 점수 입력할 공간 확보
		int[][] scores = new int[studentNumber][3];//행 - 학생 수, 열- 과목점수
		
		//개별 합계, 평균, 석차 담을 공간 확보
		int[] sum = new int[studentNumber];//합계
		double[] avg = new double[studentNumber];//평균
		String[] grade = new String[studentNumber];//등급
		int[] rank = new int[studentNumber];//석차
		
		//이름과 학과를 한번에 받아서 처리
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름, 학과 순으로 입력 >>");
			for(int a = 0; a < name[i].length; a++) {
				//이름과 학과 name[i][0], 학과 name[i][1]
				name[i][a]= scan.nextLine();
//				//확인용
//				System.out.print(name[i][a]);
			}//end of for안
		}//end of for밖
		
		System.out.println("DB, SW, PG 성적을 순서대로 입력 >>");
//		String department =scan.nextLine();
		for (int i = 0; i < scores.length; i++) {
			//개별 합계, 평균, 석차
			int personalSum=0;//개별 합계
			double personalAvg = 0.0;//개별 평균
			rank[i] = 1;//석차
			
			for(int a = 0; a < scores[i].length; a++) {
				//score[i][0] : db, score[i][i] : sw, scores[i][2]:pg
				scores[i][a] = Integer.parseInt(scan.nextLine());
				
				//개별 합계
				personalSum+= scores[i][a];
				
			}//end of for안
			System.out.println("------------");
			
			//개별 평균
			personalAvg = (double)personalSum/scores[i].length;
			
			sum[i] = personalSum;
			avg[i] = personalAvg;
		
			//학점구하기
			if(avg[i]>=90) {
				grade[i] = "A";
			}else if(avg[i]>=80) {
				grade[i] = "B";
			}else if(avg[i]>=70) {
				grade[i] = "C";
			}else if(avg[i]>=60) {
				grade[i] = "D";
			}else {
				grade[i] = "F";
			}//end of if
		}//end of for밖
		
		//석차구하기
		for (int i = 0; i < avg.length; i++) {
			for(int a = 0; a<avg.length; a++) {
				//한사람의 자료를 비교
				if(avg[i]<avg[a]) {
					rank[i] +=1;
				}//end of if
			}//end of for 안
		}//end of for 밖
		
		//입력받은 자료 출력
		System.out.println("==================================================================");
		System.out.println("번호\t이름\t학과\tdb\tsw\tpg\t평균\t학점\t석차\t");
		System.out.println("==================================================================");
		
		//학생 수만큼 출력
		for (int i = 0; i < studentNumber; i++) {
			//번호 : i+1
			System.out.print((i+1)+"\t");
			
			//이름과 학과
			for (int j = 0; j < name[i].length; j++) {
				System.out.print(name[i][j]+"\t");
				
			}//end of for안
			//과목별 성적 - 3과목의 배열
			for (int a = 0; a < rank.length; a++) {
				System.out.print(scores[i][a]+"\t");
			}//과목별 성적 for문 끝
			
			//합계, 평균, 학점, 석차
			System.out.print(sum[i]+"\t"+avg[i]+"\t"+grade[i]+"\t"+rank[i]+"\n");
		}//end of for밖
		
		System.out.println("--------------------");
		System.out.print("개인성적을 보고 싶은 학생의 번호 입력 >>");
		int no = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < studentNumber; i++) {
			//번호는 (i+1)로 처리했으므로, i+1과 입력된 번호가 같은지 체크해서 처리
			if((i+1)==no) {
				//개인성적표 출력
				System.out.println("*** "+name[i][0]+"님의 성적 ***");//name[i][0] - 이름, name[i][1] - 학과
				
				//입력받은 학생의 개인 성적표 자료를 출력하기
				System.out.println("==================================================================");
				System.out.println("번호\t이름\t학과\tdb\tsw\tpg\t평균\t학점\t석차\t");
				System.out.println("==================================================================");
				
				//번호
				System.out.print((i+1) +"\t");
				
				//이름과 학번 - 배열에 담아놓아 for사용
				for (int j = 0; j < rank.length; j++) {
					System.out.print(name[i][j]+"\t");
				}//end of 이름 for 안
				
				//성적 - 배열로 담아놓음, for
				for (int j = 0; j < scores[i].length; j++) {
					System.out.print(scores[i][j]+"\t");
				}//end of 성적 for 안
				
				//합계, 평균, 학점, 석차
					System.out.print(sum[i]+"\t"+avg[i]+"\t");
					System.out.print(grade[i]+"\t"+rank[i]+"\t");
					
					
					//해당 학생의 자료를 출력했으면 반복문 빠져나가기
					break;
			}//end of if
			System.out.println("------");
		}//end of for 밖
		
	}//end of main

}
