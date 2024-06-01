package method;

public class MethodExam02_1 {
	
	public static void showPrint2(int count, String a) {
		for(int i=1; i<=count; i++) {
			System.out.println(a);
		}//end of for
//		return; // 일반적으로 생략되어 있고 생략하고 씀
	}//end of showPrint2	

	
	public static void main(String[] args) {
		showPrint(3);//메소드 호출, 3번 호출
		showPrint2(3, "안녕");
	}//end of main
	
	
	public static void showPrint(int num) {
		for(int i=1; i<=num; i++) {
		System.out.println("Hello Java");
		}
	}//end of showPrint, 끝나면 자기를 호출한 곳으로 감
}
