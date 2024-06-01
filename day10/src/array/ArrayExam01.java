package array;

public class ArrayExam01 {

	public static void main(String[] args) {
		// 반 학생 10명...단점 : 변수를 많이 선언해야함 >>극복 : 배열
//		String nameHong = "홍길동";
//		String nameKim = "김자바";
//		String nameNam = "남기자";
		//.....
//		int hongKor = 70;
//		int kimgKor = 90;
//		int namgKor = 85;
		//.....
		
		
		//#1.방법1
		//#1-1. 배열 공간 확보
//[]공간을 만들어라 //힙에 3자리 공간을 만들어라
		int[] kor = new int[3];//힙이라는 영역에 정수형을 담을 수 있는 공간을 3개 확보하고
							   //kor라는 변수에 그 주소를 넘겨 알려주기
			//빈공간을 허용할 수 없어 처음에 0이 담김(초기화) //힙에는 비어있는 변수나 객체를 만들 수 없다. 그래서
			//값이 생기면 그 값을 넣어줌 string은 null로 담김 //jvm은공간을 만들고 값이 없으면 기본값으로 초기화를 시켜
			//new가 kor에게 주소를 담아줌					  //int >>0, long >>0L, double >>0.0, float >>0.0f
															  //boolean >> false
															  //참조형(String,...)은 null로 초기화시켜줌
		//#2.배열 공간에 값을 담기
		kor[0]=70;
		kor[1]=90;
		kor[2]=85;
		
		//3.출력
		System.out.println("kor[0]= " + kor[0]);
		System.out.println("kor[1]= " + kor[1]);
		System.out.println("kor[2]= " + kor[2]);
		
		for(int i=0; i<=2; i++) { //i+=1, ++i도 가능
			System.out.println("kor["+i+"] = "+ kor[i]);
		}//end of for
	}//end of main

}//end of class
