package homework;

public class ExamMain {

	public static void main(String[] args) {
		
		Countable[] count = {
				new Bird("뻐꾸기"),
				new Bird("독수리"),
				new Tree("사과나무"),
				new Tree("밤나무")
		};
		
		for (int i = 0; i < count.length; i++) {
			count[i].count();
		}
		System.out.println("---------------");
		for (int j = 0; j < count.length; j++) {
			if(count[j] instanceof Bird bird) {
				bird.fly();
			}else if(count[j] instanceof Tree){
				Tree tree = (Tree)count[j];
				tree.ripen();
			}
			
		}
		

	}

}
