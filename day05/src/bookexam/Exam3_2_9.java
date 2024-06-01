package bookexam;

import java.util.Scanner;

public class Exam3_2_9 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		double num1 = 0;
		double num2 = 0;
		double result = 0;

			
		System.out.print("첫 번째 수 >> ");
		num1 = Scan.nextDouble();
		
		System.out.print("두 번째 수 >> ");
		num2 = Scan.nextDouble();
		
		result = num1 + num2;
		
		System.out.println("---------------------------------");
		
		if(result == 0.0) {	//if의 시작	
				
		System.out.print("결과 : " + result  );
		result = Scan.nextDouble();
		
		}else {//if의 끝과 else의 시작
			
		System.out.print("결과 : 무한대");
		result = Scan.nextDouble();
		}//else의 끝
		
		System.out.println("===================================");
		
//		책의 형식, 잘 쓰지 않는 방식
		
//		double result = num1/num2
		
//		if(Double.isInfinite(num1/num2) {
//			System.out.println("0.0으로 나눌 수 없음");
//			System.out.println("Infinity로 결과 나옵니다.");
//		}else {
//			System.out.println(num1/num2);
//		}
//		
//		System.out.println("===================================");
//		if(num2 != 0.0) {
//			System.out.println("결과 : " + (num1/num2));
//		}else {
//			System.out.print("결과 : 무한대");
//		}
		
		Scan.close(); //scan 닫음	
		
	}//main의 끝

} //class의 끝
