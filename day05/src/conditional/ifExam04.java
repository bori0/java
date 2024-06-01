package conditional;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ifExam04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int num =0;
//		
//		System.out.println("정수 입력 >> ");
//		num = scan.nextInt();
//		
//		if(num%2 ==1) {
//			System.out.println("당신이 입력한 값은 " + num + "로, 홀수입니다.");
//		}else {
//			System.out.println("당신이 입력한 값은 " + num + "로, 짝수입니다.");
//		}
		
		int a = 1234; //1,234원
		double d = 1234.567; // 1,234.567
		
		DecimalFormat f = new DecimalFormat("#,##0원");//패턴 정의
		DecimalFormat f1 = new DecimalFormat("#,###.###");//패턴 정의
		                                                  //0.00 두개만 쓰면 반올림 되나봄
		//f.format(대상)
		//f1.format(대상)
//		System.out.println(f.format(a)); //얘는 문자열이라 String으로 받아야함
//		System.out.println(f1.format(d));
		
		//서식으로 쓰고 싶은 경우
		System.out.printf("%s\n", f.format(a));
		System.out.printf("%s\n", f1.format(d));
		
		scan.close(); //scan 닫음
	}

}
