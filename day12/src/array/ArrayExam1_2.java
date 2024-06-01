package array;

public class ArrayExam1_2 {

	public static void main(String[] args) {
		//학원분 코드
		int[][] num = new int[5][5];
		      
			for(int i=0; i<num.length; i++) {
				for(int j=0; j<num[i].length; j++) {
					num[i][j] = (i*5)+(j+1);
		            System.out.print(num[i][j]+"\t");
		         }
		         System.out.println();
			}
		      
	}

}
		
	
