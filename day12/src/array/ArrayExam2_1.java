package array;

import java.util.Scanner;

public class ArrayExam2_1 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 프로그램을 작성하시오.
		출력형태 1)  
		숫자를 입력하세요>>
		2
		1=>    1   3
		2=>    5   7*/
		Scanner scan = new Scanner(System.in);
		
		//6-2번 문제
	      int input2 = scan.nextInt();
	      
	      int[][] arr3 = new int[input2][input2];
	      
	      for(int i =0; i < arr3.length; i++) {
	         for(int j = 0; j < arr3[i].length; j ++) {
	            arr3[i][j] = (i*9) + j*3 +1;
	            System.out.print(arr3[i][j]+"\t");
	         }System.out.println();
	      }
	      //6-3번 문제
	      int input3 =scan.nextInt();
	      
	      int[][] arr4 = new int[input3][input3];
	      
	      for(int i =0; i < arr4.length; i++) {
	         for(int j = 0; j < arr4[i].length; j ++) {
	            arr4[i][j] = (i*25) + j*5 +1;
	            System.out.print(arr4[i][j]+"\t");
	         }System.out.println();
	      }
	}

}
