package homework;

import java.util.Scanner;

public class Student1 {
private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("학생 수 입력");
		int studentNum = Integer.parseInt(scan.nextLine());
		
		//이름과 학번 배열공간 확보			이름,학번 2개 묶어서 자리 확보
		String[][] name = new String[studentNum][2];
		
		//성적 배열공간 확보				db, sw, pq 3개 한번에 묶어서
		int[][] score = new int[studentNum][3];
		
		//개별 합계, 평균, 석차 담을 공간 확보
		int[] sum = new int[studentNum];//합계
		double[] avg = new double[studentNum];//평균
		String[] grade = new String[studentNum];//등급
		int[] rank = new int [studentNum];// 석차
		
		//이름과 학과를 한번에 물어보고 입력받기  //2개씩이라 중첩 for는 이름이랑 학번만
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름, 학과 순으로 입력 >>");
			for (int j = 0; j < name[i].length; j++) {
				name[i][j]=scan.nextLine();//이름[i][0] 학과[i][1] 순으로 입력
			}//end of for
		}//end of for
		
		//성적 3개 입력받기
		System.out.println("DB, SW, PQ 순으로 성적 입력 >>");//3개씩이라 for문 다시 작성
		for (int i = 0; i < score.length; i++) {
			int personalsum =0;//개별 합계
			double personalavg =0.0;//개별 평균
						
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = Integer.parseInt(scan.nextLine());
				
				//개별합계
				personalsum+=score[i][j];
				
			}//end of for 안
			
			//개별 평균
			personalavg =(double)personalsum/score[i].length;
			
			sum[i] = personalsum;
			avg[i] = personalavg;
			
			if(sum[i]>=90) {
				grade[i] = "A";
			}else if(sum[i]>=80) {
				grade[i] = "B";
			}else if(sum[i]>=70) {
				grade[i] = "B";
			}else if(sum[i]>=60) {
				grade[i] = "B";
			}else {
				grade[i] = "F";
			}//end of if
		}//end of for 밖
		
		//석차구하기
		for (int i = 0; i < avg.length; i++) {
			for (int j = 0; j < avg.length; j++) {
				if(avg[i]<avg[j]) {
					rank[i]++;
				}//end of if
			}//end of for안
		}//end of for 밖
		
		//입력받은 자료 출력
		System.out.println("==================================================================");
		System.out.println("번호\t이름\t학과\tdb\tsw\tpg\t평균\t학점\t석차\t");
		System.out.println("==================================================================");
		
		//학생 수만큼 출력
		for (int i = 0; i < studentNum; i++) {
			//번호 (i+1)
			System.out.print((i+1)+"\t");
			
			//이름, 학번
			for (int j = 0; j < name[i].length; j++) {
				System.out.print(name[i][j]+"\t");
			}//이름, 학번 끝
			
			//점수
			for (int j = 0; j < score[i].length; j++) {
				System.out.println(score[i][j]);
			}//점수 끝
			
			System.out.print(sum[i]+"\t"+avg[i]+"\t"+grade[i]+"\t"+rank[i]+"\n");
			System.out.println();//줄바꿈
		}//end of for
		
		System.out.print("개인성적을 보고 싶은 학생의 번호 입력 >>");
		int num = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < rank.length; i++) {
			System.out.println("*** "+name[i][0]+"님의 성적 ***");
			
			if((i+1)==num) {
				System.out.println("==================================================================");
				System.out.println("번호\t이름\t학과\tdb\tsw\tpg\t평균\t학점\t석차\t");
				System.out.println("==================================================================");
				
				//번호
				System.out.print((i+1) +"\t");
				
				//이름,학번
				for (int j = 0; j < name[i].length; j++) {
					System.out.print(name[i][j]+"\t");
				}
				
				//성적 출력
				for (int j = 0; j < score[i].length; j++) {
					System.out.println(score[i][j]+"\t");
				}
				
				//합계, 평균, 학점, 석차
				System.out.print(sum[i]+"\t"+avg[i]+"\t");
				System.out.print(grade[i]+"\t"+rank[i]+"\t");
				break;
			}
		}
	}//end of main
}
