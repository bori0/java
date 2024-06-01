package array;

public class ArrayExam1 {

	public static void main(String[] args) {
		/*  1    2    3    4    5
			6    7    8    9   10
	 		11   12   13   14   15
			16   17   18   19   20
			21   22   23   24   25
			
			배열 또는 이중 for 문
			행과 열이 있다는건 이차원*/
		
		
		int[][] count = new int[][]{
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12 ,13 ,14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
		};
		
		for(int a=0; a<count.length; a++) {
			for(int b=0; b<count[a].length; b++) {
				if(b%5==0) {
					System.out.println();
				}
				System.out.print(count[a][b] +"\t");
			}
			
		}
		
		
		

	}

}
