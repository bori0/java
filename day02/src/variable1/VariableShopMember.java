package variable1;

public class VariableShopMember {

	public static void main(String[] args) {
		//#1.변수선언
		String id="", password="",  name="", number="", mail="";
		
		//2.변수에 값 대입
		id="choong01";
		password="choong01";
		name="홍길동";
		number="010-1234-1234";
		mail="choong@c.com";
		
		//#3.출력		
		System.out.println("\t* 회원가입 *");
		System.out.println("아  이  디 : " + id);
		System.out.println("비밀  번호 : " +password);
		System.out.println("회  원  명 : " +name);
		System.out.println("전화  번호 : " +number);
		System.out.println("이  메  일 : " +mail);
		
		
			

	}

}
