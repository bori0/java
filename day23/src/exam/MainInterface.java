package exam;

public class MainInterface {

	public static void main(String[] args) {
		Countable[] ct = {
				new Bird("뻐꾸기"),
				new Bird("독수리"),
				new Tree("사과나무"),
				new Tree("밤나무")
		};
		
		//Countable cBird1 = new Bird("뻐꾸기");//업캐스팅
		//Countable cBird2 = new Bird("독수리");//자식을 부모타입에 담기
		//Countable cTree1 = new Bird("사과나무");
		//Countable cTree2= new Bird("밤나무");
		
		for (int i = 0; i < ct.length; i++) {
			ct[i].count();
		}
		System.out.println("---------");
		for (Countable ca : ct) {
			ca.count();
		}
		System.out.println("---------");

		//fly, 열매익은거 - 자식메소드, 현재 부모에 담겨있음
		for (int j = 0; j < ct.length; j++) {
			if(ct[j] instanceof Bird bird) {//다운캐스팅
				bird.fly();
			}else if(ct[j] instanceof Tree) {
				//	자식	(자식)부모
				Tree tree = (Tree)ct[j];//부모를 자식으로 타입변환
				tree.ripen();
			}//if 끝
			
		}//for 끝
	}

}
