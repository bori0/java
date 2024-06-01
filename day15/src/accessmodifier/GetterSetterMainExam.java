package accessmodifier;

public class GetterSetterMainExam {

	public static void main(String[] args) {
		GetterSetterExam gs = new GetterSetterExam();
		
//		gs.id = "가나다"; //불가 private이기 때문
		gs.show();//show는 public이라 당겨지고 그 안에 담겨 있는 id는 private인데 같은 클래스라서 당겨짐
		String result = gs.getId();
		
//		gs.getId();
		gs.setId("가나다");
		gs.show();
		
		GetterSetterExam gsconst = new GetterSetterExam("choong", "1203");
		gsconst.show();
		
	}

}
