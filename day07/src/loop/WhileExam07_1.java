package loop;

public class WhileExam07_1 {

	public static void main(String[] args) {
		// 1~10까지의 홀수의 합만 구하기 설명
		
		int oddSum = 0;
		int i=1;
		
		while(i<=10) {
			if(!(i%2==1)) {
				continue;//ERROR, i=2일 때 while로 바로 올라가기 때문에 계속 2로만 진행
				         //i++를 while 바로 밑으로 올리고, int i=0;, while(i<10)으로 바꿔주면 가능
			}//if의 끝
			oddSum += i;
			i++;
		}//while의 끝

	}

}
