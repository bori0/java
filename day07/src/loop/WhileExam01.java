package loop;

public class WhileExam01 {

	public static void main(String[] args) {
		//1~5까지 자연수의 합
		//While은 증감값이 없다
		
		int i=1;
		int sum = 0;
		
		while(i<=5) {
			sum+=i;
			System.out.println(sum); //증감식 없이 출력만 적었을 경우
                                     //i가 계속 커지는게 아니라 계속 1이고
			                         //조건에 해당하므로 계속 더하게 된다.
			            //i값을 증감시키거나, 조건을 더해서 while문을 빠져 나갈 수 있게 만든다.
			i++; //증감식
			
			                         //증감식이 뒤에 있는 경우 0~5까지 더하게 됨
							 		 //아니면 while 조건문을 <=말고 < 쓰는 형식으로 바꾸면 됨
			
			sum+=i;
			System.out.println(sum); //증감식이 앞에 있는 경우 0~6까지 더하게 됨			
		}
		
	}

}
