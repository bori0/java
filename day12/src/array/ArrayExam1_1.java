package array;

public class ArrayExam1_1 {

	public static void main(String[] args) {
		//선생님 코드
		int[][] num = new int[5][5];
		int k =1;
		      
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.printf("%5d", k);
					k++;
		         }//안쪽 for문 끝
		         System.out.println();
			}//바깥쪽 for문 끝
		      
	}//end of main

}//end of class
		
	
