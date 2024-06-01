package array;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 프로그램을 작성하시오.
		출력형태 1)  
		숫자를 입력하세요>>
		2
		1=>    1   3
		2=>    5   7*/
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		
		System.out.println("숫자를 입력하세요 >>");
		input = scan.nextInt();

		int[][] number = new int[input][input];
		int count = 0;
		
		for(int a=0; a<number.length; a++) {
			for(int b=0; b<number[a].length; b++) {
				number[a][b] = 1+(input*input*a)+(input*b);
				System.out.printf("%5d",number[a][b]);
			}
			System.out.println();
		}
	}

}
