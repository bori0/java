package exam.array;

public class Exam2 {

	public static void main(String[] args) {
		int[][] arr= new int[5][5];
		int value=1;//초기값
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				arr[i][j]=value;
				System.out.print(arr[i][j]+"\t");
				value++;
			}//end of for안
			System.out.println();
		}//end of for밖
	}

}
