package bookexam;

public class MemberServiceExam {

	public static void main(String[] args) {
		//#1. MemberService 객체 생성
		MemberService268_3 memberService = new MemberService268_3();
		
		//#2. 객체 활용
			/*
			 #2-1. 구성
			 로그인 메소드를 호출하고 나면 결과고 true/false 리턴받음
			 결과를 리턴받아 결과가 true이면 로그인 메세지 출력
			  						false	  id와 password가 올바르지 않다는 메세지 출력
			  1) 로그인 메소드를 호출해서 결과받기
			  	결과값을 받고 조건문에 쓸 수 있게 변수선언 : 타입 - boolean, 지역 변수 - result
			  2) if~else
			
			 #2-2. login() 메소드 호출*/
//		boolean result = login("홍길동", "345"); //객체 생성이 안 되서 사용불가
		boolean result = memberService.login("hong", "12345");
		
		//#2.3 판단 - 아이디 비번 맞는지
//		if(result) {//boolean 이라서 결과값 자체가 조건, 
//			System.out.println("로그인됨");
//		}else {
//			System.out.println("아이디 비번 안 맞음");
//		}//end of if
		
		//이렇게 해도 가능
		String resultLogin ="";
		
		if(result) {//boolean 이라서 결과값 자체가 조건, 
			resultLogin = "로그인됨";
		}else {
			resultLogin = "아이디 비번 안 맞음";
		}//end of if
			System.out.println(resultLogin);
			
		//#2-4. logout() 메소드 호출
		memberService.logout("hong");

	}//end of main

}//end of class
