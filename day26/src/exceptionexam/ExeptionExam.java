package exceptionexam;

public class ExeptionExam {

	public static void main(String[] args) {
		int a =5;
		int b =0;
		int[] arr= {10, 20};
		int[] test ;
		String arrTest = null;//아직 참조하는 객체가 없다.
		
		System.out.println(arrTest.toString());//java.lang.NullPointerException
		
//		for (int i = 0; i < test.length; i++) {//일반 예외 - 컴파일 전에 예외확인 가능
//			test[i] = i+20;
//			System.out.println(test[i]);
//		}

		
//		for (int i = 0; i < arr.length; i++) {//RuntimeException - 실행 예외
//			System.out.println(arr[i]);
//			arr[i+1] = i+30; //java.lang.ArrayIndexOutOfBoundsException
//		}
		
//		System.out.println(a/b);//java.lang.ArithmeticException

	}

}
