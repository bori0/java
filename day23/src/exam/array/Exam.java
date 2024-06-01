package exam.array;

public class Exam {

	public static void main(String[] args) {
		int[][] arr=new int[5][5];
		int value=1;//시작값
		
		//값을 배열에 누적
		 for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[i].length; j++) {
				arr[i][j]=value;
				value++;
			}//end of for안
		}//end of for밖
		 
		 //출력
		 for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[i].length; j++) {//j=0부터는 오른쪽 정렬
				if(arr[i][j]==0) {					//j=i부터는 왼쪽 정렬
//					arr[i][j] ="";//""문자열, arr[i][j] - 정수
					System.out.printf("%2s\t"," ");
//					System.out.print("         ");
				}else {
				System.out.print(arr[i][j]+"\t");
				}//end of if
			}//end of for안
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println();
		 }//end of for밖
	}//end of main

}
