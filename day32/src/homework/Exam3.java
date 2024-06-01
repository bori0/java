package homework;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//do~while버전..
		int i=1;
		String name="";
		int score=0;
		
		do {
				
				System.out.print("이름입력");
				name = sc.nextLine();
				
				System.out.print("점수");
				score = Integer.parseInt(sc.nextLine());
				
				System.out.print(i+name+score);
				i++;
		}while(i<=3);//왜 이렇게 쓰는지 이해가 잘 안 됨...
	
	}

}
