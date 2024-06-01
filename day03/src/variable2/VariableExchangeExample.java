package variable2;

public class VariableExchangeExample {

	public static void main(String[] args) {
		//#1.변수 선언
		int x=3;
		int y=5;
		int temp=0;
		
		//#2.변경 전 변수에 담긴 값을 출력
		System.out.println("변경 전 : x=" +x+ ", y="+y );
		
		//#3.변수에 담긴 값을 변경
		temp=x;//x에 담긴 값을 temp 변수에 담기
		x=y;//y에 담긴 값을 x 변수에 담기
		y=temp;//temp에 담긴 값(초기 x의 값)을 y에 담기
		
		//#4.변경 후 변수에 담긴 값을 출력
		System.out.println("변경 후 : x=" +x+ ", y="+y);
		
		int num=3;
		System.out.println(num);
		
		num=7;
		System.out.println(num);
		
//		num=2.5; //num은 정수만 담을 수 있음, 2.5는 실수이므로 담을 수 없다
		
//		double num=3.5;
		//위에서 이미 한번 선언된 (int타입)변수 선언 불가
		
	}

}
