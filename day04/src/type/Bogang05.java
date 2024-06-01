package type;

import java.util.Scanner;

public class Bogang05 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		String name ="";
		int num = 0;
//		String num ="";
		String address ="";
		
//		System.out.println("이름, 전화번호, 주소 >> ");
//		String name = Scan.next();
//		String num = Scan.next(); //-포함해도 괜찮다
//		String adress = Scan.next(); // 한번에 다같이 nest나 nestLine 써야 괜찮다
		
		
//		System.out.println("이름, 전화번호, 주소 >> ");
//		String name = Scan.nextLine();
//		String num = Scan.nextLine(); //-포함해도 괜찮다
//		String adress = Scan.nextLine(); // 한번에 다같이 nest나 nestLine 써야 괜찮다
		
		
		
		System.out.println("이름 입력 >> ");
		name = Scan.next();
		
		System.out.println("전화번호를 입력(-제외하여 적어주세요) >>") ;
		num = Scan.nextInt();
		
		System.out.println("주소 입력 >> ");
		address = Scan.next();
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("전화번호 : %d\n", num);
		System.out.printf("주소 : %s\n", address);
		
		Scan.close(); //scan 닫음			

	}

}
