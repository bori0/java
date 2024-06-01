package loop;

public class ForExam05 {

	public static void main(String[] args) {
		
		
//		int gop = 3;//내가 한 코드
//		
//		for(int a=1; a<=9; a++) {
//			System.out.println("3 * "+ a +" = " + (3*a));  //OK
			
		
		
		int dan=3; //강사님 코드
		
		for(int a=1; a<=9; a++) {
//			System.out.println(dan+" * "+a+" = "+(dan * a));  //OK
			
			System.out.printf("%d * %d = %d\n", dan, a, (dan*a));   //OK
		}

	}

}
