package array;

public class ArrayExam1_3 {

	public static void main(String[] args) {
		//선생님 코드2 - 배열형
		int[][] count = new int[5][5];
		int k =1;
		      
			for(int i=0; i<count.length; i++) {
				for(int j=0; j<count[i].length; j++) {
					count[i][j] = k;
					System.out.printf("%5d", count[i][j]);
					k++;
		         }//안쪽 for문 끝
		         System.out.println();
			}//바깥쪽 for문 끝
		      
	}//end of main

}//end of class
		
	
