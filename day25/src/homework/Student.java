package homework;

import java.util.Scanner;

public class Student {
	public static Scanner scan = new Scanner(System.in);
	//스캐너 객체 생성
	public static void main(String[] args) {
		
		//학생수 입력받기
		System.out.println("학생 수 입력 >>");
		int studentCount = Integer.parseInt(scan.nextLine());
		
		//변수 선언
		String[][] name= new String[studentCount][2];//이름과 학과 배열
		int[][] score= new int[studentCount][3];//점수 배열
		int sum[] = new int[studentCount];//합계
		double avg[] = new double[studentCount];//평균
		String grade[] =  new String[studentCount];//학점
		int gradeNum[] = new int[studentCount];//석차
		int number=0;//학생 번호
		
		//이름과 학과 입력받기
		for (int i = 0; i < name.length; i++) {//i, 열=이름받기
			System.out.println("이름과 학과 순서대로 입력 >> ");
			for (int j = 0; j < name[i].length; j++) {//j=학과 받기
				name[i][j]=scan.nextLine();
			}//안쪽 for끝
		}//바깥 쪽 for 끝
		
		
		//성적 순서대로 입력받기
		for (int i = 0; i < score.length; i++) {//학생 한 명씩
			System.out.println("DB, SW, PG 성적 순서대로 입력 >>");
			int personalSum=0;//개별 합계
			double personalAvg=0.0;//개별 평균
			
			for (int j = 0; j < score[i].length; j++) {//점수 세개 입력받기
				score[i][j]=Integer.parseInt(scan.nextLine());
				
				personalSum+=score[i][j];//점수 3개의 합
			}//for 안 끝
			personalAvg=(double)personalSum/score[i].length;
			
			sum[i] = personalSum;
			avg[i] = personalAvg;
			
			//학점 조건문
			if(avg[i]>=90) {
				grade[i]="A";
			}else if(avg[i]>=80) {
				grade[i]="B";
			}else if(avg[i]>=70) {
				grade[i]="C";
			}else if(avg[i]>=60) {
				grade[i]="D";
			}else {
				grade[i]="F";
			}
			
			System.out.println();//줄바꿈
		}//for 밖 끝
		
		for (int i = 0; i < avg.length; i++) {
			gradeNum[i]=1;//석차는 1부터 시작이므로 1로 초기화
			for (int j = 0; j < avg.length; j++) {
				//석차
				if(avg[i]<avg[j]) {
					gradeNum[i]+=1;
				}//if 석차 끝
				
			}//안쪽 for끝
		}//바깥쪽 for끝
		
		//출력하기
		System.out.println("==================================================================================");
		System.out.println("번호\t이름\t학과\tDB\tSW\tPG\t합계\t평균\t학점\t석차");
		System.out.println("==================================================================================");

		
		for (int i = 0; i <name.length; i++) {
			System.out.println();
			System.out.print((i+1)+"\t");//번호 출력
			
			for (int j = 0; j < name[i].length; j++) {
				System.out.print(name[i][j]+"\t");//이름과 학과 출력
			}//안쪽 for끝
		
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");//점수 3개 출력
			}//안쪽 for 끝
			
			System.out.print(sum[i]+"\t"+avg[i]+"\t"+grade[i]+"\t"+gradeNum[i]);//합계, 평균, 학점, 석차 출력
			System.out.println();
		}//바깥 for끝
		
		
		System.out.println("===============================================");
		System.out.println("개인성적을 보고 싶은 학생의 번호 입력>>");
		int choice=Integer.parseInt(scan.nextLine());//보고싶은 학생의 번호 입력받기
		
		
		for (int i = 0; i < studentCount; i++) {
			//입력받은 수와 번호가 맞으면 성적 출력하기
			if(i+1==choice) {
				System.out.println("==================================================================================");
				System.out.println("번호\t이름\t학과\tDB\tSW\tPG\t합계\t평균\t학점\t석차");
				System.out.println("==================================================================================");

				
				System.out.println();
				System.out.print((i+1)+"\t");//번호 출력
				for (int j = 0; j < name[i].length; j++) {
					System.out.print(name[i][j]+"\t");//이름과 학과 출력
				}//안쪽 for끝
				
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j]+"\t");//점수 3개 출력
				}//안쪽 for끝
				System.out.print(sum[i]+"\t"+avg[i]+"\t"+grade[i]+"\t"+gradeNum[i]);//합계, 평균, 학점, 석차
				
			}//if문 끝
		}//바깥 for끝
	}//end of main
}//end of class
