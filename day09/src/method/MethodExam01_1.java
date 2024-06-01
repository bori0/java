package method;

public class MethodExam01_1 {
				//내가 일처리를 하고 실행만 시켜주고 끝내겠다, 넘겨주는 값이 없다.
	
	public static void printShow(int num) {//()안에 써서 int num;이라고 따로 선언 안 해줘도 됨
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum +=i;
		}
		System.out.println("1 ~ "+ num + "까지의 합 : " +sum); //메소드를 위에 쓰든 밑에 쓰든 상관없다.
		return; //당연히 있는데 생략되어 안 보이는 것
	}//printShow의 끝
	
	
	
	public static void main(String[] args) {//메소드 안에 메소드를 선언 할 수 없다
		//위에가 static이면 밑에도 무조건 static
		//             이 없으면 static붙여도 되고 안 붙여도 되고
		
		showInfo();//메소드 호출(showInfo())
		
		int result = sumCall(1, 5);
		System.out.println("1~5의 합 : " + result);//이렇게 쓰는게 더 깔끔하다
		
		System.out.println("1~10의 합 : " + sumCall(1, 10));
								 		 //sumCall()메소드를 호출한다
		  											//1, 10 >> 매개값, 인자
		System.out.println("50~100의 합 : " + sumCall(50, 100));		
		System.out.println("35~75의 합 : " + sumCall(35, 75));
		printShow(100);
		
		showInfo();//메소드 호출
		
	}//end of main
	
	
			     //return 할 타입과 같아야 한다
	  //int 반환타입 //메소드 //start, end >> 매개변수, 파라미터, 정수값만 받기 때문에 int
	public static int sumCall(int start, int end) {//실수를 적을 경우 double을 써야함
//	public static double sumCall(int start, int end) {
//	public static String sumCall(int start, int end) {
		int sum = 0;
		for(int i=start; i<=end; i++) {
			sum += i;
		}//end of for
		return sum;
	}//end of sumCall
				
	
	
	public static void showInfo() {
		System.out.println("여기는 리턴 값이 없는 것을 연습합니다.");
	}//showInfo의 끝
	
	}
