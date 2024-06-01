package homework;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 >>");
		String name = sc.nextLine();
		System.out.print("참여여부 >>");
		System.out.println("[1.참여 | 2.불참]");
		int choice = Integer.parseInt(sc.nextLine());
		
		String result= "";
		if(choice == 1) {
			result="참여";
		}else {
			result = "불참";
		}
		System.out.println(name +"님은 "+result);
		
		result = (choice ==1)?"참여":"불참";
		System.out.println(name +"님은 "+result);
	}

}
