package loop;

public class WhileExam07 {

	public static void main(String[] args) {//메인의 시작
		
		int a = 0;
		int sum = 0;
		
		while(a<10) {// while 의 시작
			a++;
			if(a%2==1) {// if 의 시작
				sum += a;
				continue;
			} //if의 끝
			
		}//while 의 끝
			
			System.out.println(sum);
		}//메인의 끝

	}


