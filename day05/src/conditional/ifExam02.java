package conditional;

import java.util.Scanner;

public class ifExam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num =0;
		int result = 0;
		
		System.out.println("숫자 입력 >> ");
		num = scan.nextInt();
	
		
		if(num % 2 ==1) {
			result =num*2;
		}else {
			result =num*3;
		}
		System.out.println(result);//if, else 하나씩 써도 괜찮고 조건문 끝나고 같이 써도 됨
		
		scan.close(); //scan 닫음
	}

}
