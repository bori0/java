package array;

public class ArrayExam04 {

	public static void main(String[] args) {
		//#1.배열 공간 확보
		int[] kor = new int[2];
		
		
		//#2. 배열공간에 값담아 출력
		//	배열.length >>배열공간의 길이,   문자열.length() >>문자열의 길이
		for(int i=0; i<kor.length; i++) {
			int result = i+10;
			System.out.println("kor ["+i+"] = " + result);
		}
		
						//.은 kor이 가리키고 있는 주소, kor이 가리키는 주소의 길이를 세라
		for(int i=0; i<kor.length; i++) {
			kor[i] = (i+1)*10;
			System.out.println("kor ["+i+"] = " + kor[i]);
		}

	}

}
