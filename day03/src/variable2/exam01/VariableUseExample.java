package variable2.exam01;

public class VariableUseExample {

	public static void main(String[] args) {
		//3시간 5분을 총 185분로 보이게 하기
		
		//1.변수 선언
		int hour=3;//지역변수, {}범위 안에서 사용하는 변수
		//           지역변수는 {}안에서만!!
		int minute=5;
		int totalMinute=(hour*60)+minute;
		
		//2.출력
		System.out.println(hour+"시간 "+minute+"분");
		System.out.println("총 " +totalMinute+"분");

	}

}
