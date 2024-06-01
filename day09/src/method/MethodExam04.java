package method;

public class MethodExam04 {

	public static void main(String[] args) {
		//1. 두 정수를 덧셈하는 메소드 작성, 메소드명 add(3,5)
		int result = add(3, 5);
		System.out.println("add(3,5) : "+result);
		
		//2. 세 정수를 덧셈하는 메소드를 작성, 메소드명 add2(2, 4, 7)
		int result2 = add(2, 4, 7);
		System.out.println("add2(2, 4, 7) : " + result2);
		
		//3. 두 실수형의 값을 곱셈하는
		double result3 = multDouble(1.5, 2.7);
		System.out.println("multDouble(1.5, 2.7) : "+result3);
		
		double result4 = add(5, 2.6);
		System.out.println("add(5, 2.6) : "+result4);
		
	}//end of main
	
		
	public static int add(int num1, int num2) { 
//		   int add = num1 + num2;
//		   return add;
		   return num1 + num2;
	}//end of 
	
//	public static int add(int n1, int n2) { //메소드가 같다면 컴퓨터는 메소드명(매개변수 개수 타입)
//		   return n1 * n2;					//를 찾아서 계산을 하는건데 어디갈지 모르므로 ERROR
		   									//메소드의 오버로딩
	
	public static int add(int num1, int num2, int num3) { 
//		   int add2 = num1 + num2 + num3;
		   return num1 + num2 + num3;
	}//end of 
		
	public static double multDouble(double num1, double num2) { 
//		   double multDouble = num1 * num2;
		   return num1 * num2;
	}//end of 
	
	public static double add(int num1, double num2) { 
		return num1 + num2;
	}//end of 
	
}//end or class
