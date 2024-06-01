package loop;

public class WhileExam02 {

	public static void main(String[] args) {
		//1~100까지의 짝수의 합만 구하기
		
		int evenSum = 0;
		
		for(int i=1; i<=100; i++) {

			//#방법1. 짝수인지 판별해서 짝수만 합
//			if(i%2 ==0) {
//				evenSum += i; 
//			}
			
			
			
			//#방법2.홀수면 계산하지 않게
			if(i%2==1) {
				
				//break는 if문을 제외한 자기를 감싸고 있는 {}를 빠져나감
				continue; //★★★for문으로 올라감★★★해당 블럭나와서 가장 가까운 블럭으로 올라감
//				System.out.println("여기는 홀수 관련 부분입니다");//홀수 부분들이 촤르륵 보여짐
																  //continue가 있어서 ERROR
				
			}// if 끝
			
			
			
			
			if(!(i%2==1)) { //(조건문) =짝수 를 구하겠다
				
				continue; //★★★for문으로 올라감★★★해당 블럭나와서 가장 가까운 블럭으로 올라감

			}// if 끝
			
			
			
			evenSum += i;
		}//for 끝
		System.out.println("짝수 합 : " + evenSum);
	}

}
