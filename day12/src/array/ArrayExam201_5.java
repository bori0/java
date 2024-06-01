package array;

public class ArrayExam201_5 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87,88}
		};
		int sum =0;//합계
		int count =0;//공간의 개수 : 평균을 구하기 위해 
		double avg = 0.0;//평균
		
		for(int a=0; a<array.length; a++) {
			for(int b=0; b<array[a].length; b++) {
				sum += array[a][b];
				count++;
			}//end of for 안
		}//end of for바깥
//		avg = (double)(sum/10);//=sum/10;=정수/정수=정수를 실수형으로 바꾸기 때문에 7.0
//		avg = (double)sum/10;//sum만 실수형으로 먼저 바꾸기 때문에 실수/정수 = 7.5
		avg = (double)sum/count;//추후 배열을 늘리게 되면 고치지 않아도 되어 편하다
		
		System.out.println(sum);
		System.out.println(avg);
	}//end of main

}
