package exceptionexam;

public class ExceptionExam6 {

//	public static void main(String[] args) {
//		findClass();
//
//	}
//
//	public static void findClass() {
//		try {
//			Class c = Class.forName("java.lang.String2");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//""가 없는 경우 오류가 뜰 수 있다.
//		//class 파일 정보 다 가져다 c에 놓겠다
//	}
	
	
	
	
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void findClass() throws ClassNotFoundException{//, Exception { //로 써서 상위단계로 처리
		Class c = Class.forName("java.lang.String2");//""가 없는 경우 오류가 뜰 수 있다.
		//class 파일 정보 다 가져다 c에 놓겠다
	}
	
}


