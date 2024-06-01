package loop;

public class ForExam01 {

	public static void main(String[] args) {
		//1 ~ 5 까지의 합
		
		int sum = 0;
		
		for(int i=1; i<=5; i++) {//i++ => i=i+1, i+=1
			sum = sum + i; //sum+=i
//			System.out.println("합 = " + sum);  //for문 안에 있으면 계산식 나올 때마다 값이 나옴
			
		}
		
//		System.out.println("i= " + i +", sum= " +sum);
		//ERROR, i는 지역변수 - {}안에서만 사용되고 벗어나면 메모리에서 제거

		System.out.println("합 = " + sum); //for문 밖에 있어서 한번의 값만 나옴

	}

}
