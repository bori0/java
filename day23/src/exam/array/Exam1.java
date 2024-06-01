package exam.array;

public class Exam1 {

	public static void main(String[] args) {//모래시계
		int[][] arr = new int[5][5];
		int value =1;//초기값
		int middle = 0;
		
		//값 넣기
		for (int i = 0; i < arr.length; i++) {
			middle = arr.length/2;
			if(i<middle) {
				for (int j = i; j < arr[i].length-i; j++) {//length-1 :양쪽으로 하나씩 없어야하기 때문
					arr[i][j]=value;
					value++;
				}//end of for
			}else {
				for (int j = arr[i].length-(i+1); j<=i; j++) {
					arr[i][j]=value;
					value++;
				}//end of for
			}//end of if
		}//end of for
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {//j=0부터는 오른쪽 정렬
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
	}

}
