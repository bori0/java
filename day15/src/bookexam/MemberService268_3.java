package bookexam;

public class MemberService268_3 {
	/*1. 메소드 - login(String id, String password) - 리턴 타입 boolean
				  logout(String id) - void
	  2. id-hong이고 password가 12345일 경우 true 리턴, 그 외는 false 리턴
	  	 		 &&							if ~ else,  삼항 연산자
	☆☆ (kor && eng && mat)? *** : ***  >>  0이 아니면 참
	*/
	
	//#1. 필드(=인스턴스 변수, 멤버변수 - 객체가 생성될 때 메모리에 올라감, 객체 속에 포함됨
	//				힙영역
		
	//#2. 생성자 - 객체를 초기화 - 이름은 클래스 이름과 같다.
	
	//#3. 메소드 - 동작방식, 기능
	//접근지정자 리턴타입 메소드명(매개변수 = 파라미터) { 실행문(body) }
	//[                메소드 시그니처                ]
	
	public boolean login(String id, String password) {//인스턴스 메소드, 객체에 포함됨
		boolean result = false; //boolean의 기본값은 false임
		// public은 생략가능
		//id와 password가 기존의 것과 같은지 비교
		if(id.equals("hong") && password.equals("12345")) {
			result = true;
//			return true; // 가능하나 유지보수가 힘들므로 위에 boolean 결과 변수를 선언해 쓰는 게 좋다.
		}else {
			result =false;
//			return false;
		}//end of if
		
		//삼항연산자로 쓸 경우
//		result = (id.equals("hong") && password.equals("12345"))? true : false;

		return result; //result : public에 있는 boolean 타입
	}//end of login
	
	public void logout(String id) {//인스턴스 메소드 : 객체생성이 되어있어야 사용할 수 있음
		//id로 로그인 되어 있나를 판단.
		//로그인되어 있는 자원을 반환하고 로그아웃시켜야함
		System.out.println(id+" 님이 로그아웃되었습니다.");
	}

}//end of class
 