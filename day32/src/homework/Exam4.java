package homework;

public class Exam4 {

	public static void main(String[] args) {
		/*1 ~ 10까지 자연수를 이용하여 아래와 같이 출력하는 프로그램 작성
   시작값 : 10,   최종값 : 1
   ( for문, while문, do ~ while문 구현) 
        
   출력형태) 
   10  9  8  7  6  5  4  3  2  1
*/ 
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 10; i >= 1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int a=10;
		do {
			System.out.print(a+" ");
			a--;
		}while(a>=1);
		System.out.println();
		
		a=10;
		while(a>0) {
			System.out.print(a+" ");
			a--;
		}
	}

}
