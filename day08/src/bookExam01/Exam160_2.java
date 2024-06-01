package bookExam01;

public class Exam160_2 {

	public static void main(String[] args) {
//		int sum = 0;
//		
//		for(int a=0; a<=100; a++) {//for의 시작
//			if(a%3==0) {//if의 시작
//				
//				sum+=a;
//				
//			}//if의 끝
//			
//		}//for의 끝
//		System.out.println(sum);
		
		
		//#강사님 코드
		//1~100까지 3의 배수 총합 : 숫자%3==0
		//#1. 변수선언
		int sum = 0;// 합을 담을 변수
		int i = 1;
		for(i=1; i<=100; i++) { //위에 선언했다면, i;나 i=1;이라고 씀
			
			//#2-1. i가 3의 배수일 때 처리
//			if(i%3==0) {sum = sum +i; } //sum +=i;
//				continue; //굳이 쓸 필요 없음, 어차피 다시 올라감
			
			
			//2-2. i가 3의 배수가 아닐 땐 계산을 건너띄기
			if(!(i%3==0)) {	continue; } //3의 배수가 아니면 {}들어오고
			                            //continue만나면 밑의 합으로 가지 않고
			                            //바로 for문 증감표로 감
			sum+=i;
				
		}//for의 끝
		
		System.out.println("3의 배수의 합계 : "+ sum);

	}

}
