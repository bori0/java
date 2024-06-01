package exceptionexam;

public class ExceptionExam3 {

	public static void main(String[] args) {
		int a=10;
		int b =0;
		int[] arr= {10, 20};
		String arrTest = null;
		
		try{
			System.out.println(a/b);//ArithmeticException
			
			for (int i = 0; i < arr.length; i++) {//RuntimeException - 실행 예외
				System.out.println(arr[i]);
				arr[i+1] = i+30; //ArrayIndexOutOfBoundsException
			}
				
			//NullPointerException
			System.out.println(arrTest.toString());

//		}catch(ArithmeticException e) {	
//			System.out.println("0으로 나눌 수 없습니다.");
//		}catch(ArrayIndexOutOfBoundsException e) {	
//			System.out.println("배열 공간이 부족합니다.");
//		}catch(NullPointerException e) {
//			System.out.println("참조되는 곳이 없습니다.");
//		}catch(Exception e) {//제일 상위단계의 예외이기 때문에 마지막에 적어줘야함
//							//위에 적어주게 되면 나머지는 하위단계라 포함되기 때문에 필요없음
//			System.out.println(e.getMessage());
//		}
		
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생하였습니다.");
		}
		

	}

}
