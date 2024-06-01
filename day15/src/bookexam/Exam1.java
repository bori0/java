package bookexam;

public class Exam1 {

	public static void main(String[] args) {
		int[][] num = new int[5][5];
				
		for(int a=0; a<5; a++) {
			for(int b=0; b<5; b++) {
				num[a][b] =5*a+b+1;
				System.out.print(num[a][b]+" ");
			}//end of 안쪽 for
			System.out.println();
		}//end of for 바깥
		
	}//end of main

}//end of class
