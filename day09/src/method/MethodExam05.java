package method;

import java.util.Scanner;

public class MethodExam05 {

	public static void main(String[] args) {
		//가위 바위 보
		Scanner scan = new Scanner(System.in);
		int dong = (int)Math.random()*3+1;
		int soon = (int)Math.random()*3+1;
		int rsp = 1;
		
		System.out.print("[1.가위 / 2.바위 / 3.보] 중 하나를 입력 >> ");
		rsp = scan.nextInt();
		if(dong > soon) {
			System.out.println("홍길동 승");
		}else if(soon >dong) {
			System.out.println("홍길순 승");
		}else {
			System.out.println("무승부");
		}

	}//end of main
	

	
	
	
	
}//end or class
