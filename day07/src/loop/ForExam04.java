package loop;

public class ForExam04 {

	public static void main(String[] args) {
		//#1.변수 선언
		int hol = 0; //홀수 합
		int zac = 0; //짝수 합
		int three = 0; //3의 배수 합
		
		//#2.계산
		for(int a=1; a <=100; a++) {
			//#2-1. 짝수와 홀수의 합
			if(a%2==0) {
				hol += a;
			}else{
				zac += a;
			}//3의 배수는 더 쓰지 못 하는 이유
			 //위에서 해당하는 조건들은 아래로 빠지지 못해 실행되지 않는다.
			 //0으로 나올 수 밖에 없음
			
			//2-2. 3의 배수 합
			if(a%3==0) {
				three += a;
			}

		}		
		
		System.out.println(hol);
		System.out.println(zac);
		System.out.println(three);
		

	}

}
