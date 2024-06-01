package staticmember.bookexam;

public class SingletonExamMain {

	public static void main(String[] args) {
		//객체 생성
//		SingletonExam s= new SingletonExam();
		//생성자가 private라 외부에서 객체를 생성할 수 없다
		
		//static 메소드 호출 : 클래스명.메소드명()
		SingletonExam single1 = SingletonExam.getInstace();
		SingletonExam single2 = SingletonExam.getInstace();//위 아래 주소 같음
		
		if(single1==single2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
	}

}
