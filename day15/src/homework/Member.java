package homework;

public class Member {
	//login(id, password)
	///logout (id)
	
	public boolean login(String id, String password) {
		boolean result;
		
		if(id.equals("hong")&&password.equals("12345")) {
			result = true;
		}else {
			result = false;
		}//end of if
		return result;
	}//end of boolean
	
	public void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("로그아웃됨");
		}
	}

}//end of login
