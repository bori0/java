package homework;

public class Exam9 {

	public static void main(String[] args) {
		
		//레이블
		aa: while(true) {
			for(;;) {
//				break;//가까운 중괄호 빠져나감
				break aa; //aa가 붙은 while을 빠져 나간다
						//이중 반복문을 빠져나갈 수 있음
			}
		}

	}

}
