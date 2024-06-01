package type;

import java.util.Scanner;

public class Bogang04 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		int weight = 0;
		int height = 0;
		int result = 0;
		
		System.out.println("삼각형의 밑변 >> ");
		weight = Scan.nextInt();
		
		System.out.println("삼각형의 높이 >> ");
		height = Scan.nextInt();
		
		result = (weight * height) /2;
		
		System.out.printf("삼각형의 밑변 : %d\n", weight);
		System.out.printf("삼각형의 높이 : %d\n", height);
		System.out.println("삼각형의 넓이 : " + result);
			
		
		Scan.close(); //scan 닫음			

	}

}
