package type;

import java.util.Scanner;

public class Bogang06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//sc누르고 Ctrl+Space Bar Scanner 선택하면 자동으로 import 입력된다.
		
		int apple = 0;
		int pear = 0;
		int temp = 0;
		
		System.out.println("수정 전 주문 개수");
		System.out.print("사과 개수 >> ");
		apple= scan.nextInt();
		
		System.out.print("배 개수 >> ");
		pear = scan.nextInt();
		
		System.out.println();
		System.out.println("수정 전 주문 개수");
		System.out.println("사과 : " + apple);
		System.out.println("배 : " + pear);
		
		temp = apple;
		apple = pear;
		pear = temp;
		
		System.out.println();
		System.out.println("수정 후 주문 개수");
		System.out.println("사과 : " + apple);
		System.out.println("배 : " + pear);	

	}

}
