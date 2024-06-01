package array;

import java.util.Scanner;

public class yesterdayQ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a=0;
		int b=0;
		int result = a+b;
//		int result =0;
		
		System.out.println("a값 >> ");
		a=scan.nextInt();
		System.out.println("b값 >> ");
		b=scan.nextInt();
		
//		result = a+b;
		
		if(result >=8 ) {
			System.out.println(result);
		}else {
			System.out.println("3");
		}

	}

}
