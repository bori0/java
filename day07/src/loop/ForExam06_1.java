package loop;

public class ForExam06_1 {

	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			System.out.println("i : "+ i);
//			for (int j=1; j<=5; j++) {
//				System.out.print("j : "+j+"   ");
//			}
//			System.out.println();
//			System.out.println("==============================");
//		}
		
		
		for(int i=1; i<=5; i++) {
			System.out.println( i+"단");
			for (int j=1; j<=5; j++) {
				System.out.println(i +"*"+ j+ " = " + (i*j)+"   ");
			}
			System.out.println();
			System.out.println("==============================");
		}
		
		
		

	}

}
