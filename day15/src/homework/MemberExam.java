package homework;

public class MemberExam {

	public static void main(String[] args) {
		Member m = new Member();
		
		boolean result = m.login("hong","12345");
		
		if(result) {
			System.out.println("로그인");
		}else {
			System.out.println("땡");
		}
//		if (result ==true) {
//			System.out.println("로그인");
//		}else {
//			System.out.println("다시 시도하시길");
//		}
		
		m.logout("hong");

	}

}
