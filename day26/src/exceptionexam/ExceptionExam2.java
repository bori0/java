package exceptionexam;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int[] arr= {10, 20};
		
		try {//실행을 먼저 하고
			for (int i = 0; i < arr.length; i++) {//RuntimeException - 실행 예외
				System.out.println(arr[i]);
			arr[i+1] = i+30; //java.lang.ArrayIndexOutOfBoundsException
			}
			
		}catch(Exception e) {//예외가 있는 경우, 여기로 내려와서 메세지를 실행
			System.out.println(e.getMessage());//Index 2 out of bounds for length 2
			
		}finally {//예외랑 상관없이 무조건 실행
			System.out.println("배열에서 발생할 수 있는 예외연습");
		}

	}

}
