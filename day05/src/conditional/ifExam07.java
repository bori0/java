package conditional;

import java.util.Scanner;

public class ifExam07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String trip ="";
		String result = "";
		
		System.out.println("당신이 여행하고 싶은 곳을 아래에서 골라 입력하세요\n(산, 바다) >>");
		trip =scan.nextLine();
		
		if(trip.equals("산")) {
			result = "한라산";
		}else{
			result = "동해";
		}
		
		System.out.println("당신이 선택한 여행지는 " + trip + "입니다.");
		System.out.println("당신에게 추천하는 곳은 "+ result +"입니다.");
		
		scan.close(); //scan 닫음

	}

}
