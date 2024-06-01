package method;

public class MethodExam02 {

	public static void main(String[] args) {
		showIn();
		showout();		
	}//end of main
	
	public static void showIn() {
		System.out.println("Hello Java");
		return;
	}//end of showIn
	
	
	//3번 반복
	public static void showout() {
		int num=3;
		
		for(int a=1; a<=num; a++) {
		System.out.println("Hello Java");
		}
		
		return;
	}//end of showIn

}
