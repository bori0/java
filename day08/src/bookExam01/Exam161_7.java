package bookExam01;

import java.util.Scanner;

public class Exam161_7 {

	public static void main(String[] args) {
		//while과 scanner를 이용
		
		boolean run = true;
		int balance = 0; //잔액
		int deposit = 0;
		int num = 0; //선택번호
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("---------------------------------");
		
		
		while(num<=4) {//반복문 시작
			System.out.print("선택 > ");
			num = scan.nextInt();
			System.out.print("금액 >");
			deposit = scan.nextInt();
			
			if(num==1) {//if의 시작
				System.out.println("선택 > " + num);
				System.out.println("예금액 > " + deposit);
				break;
			}else if(num==2){//if의 끝, else의 시작
				System.out.println("선택 > " + num);
				System.out.println("출금액 > " + deposit);
				break;
			}else if(num==3){//if의 끝, else의 시작
				System.out.println("선택 > " + num);
				System.out.println("잔고 > " + deposit);
				break;
			}else if(num==4){//if의 끝, else의 시작
				System.out.println("선택 > " + num);
				break;			
			}//else의 끝
			System.out.println("프로그램 종료");
			
		}//반복문 종료

	}

}
