package exam;

public class MainAbstract {

	public static void main(String[] args) {
		CountableAbstract[] ca = {
				new BirdAbstract("뻐꾸기", 2),
				new BirdAbstract("올빼미", 5),
				new TreeAbstract("사과나무", 2),
				new TreeAbstract("밤나무", 7)
		};
		
		for (CountableAbstract cs : ca) {
			cs.count();
		}
		System.out.println("-------------");
		for (int i = 0; i < ca.length; i++) {
			if(ca[i] instanceof BirdAbstract bird) {
				bird.fly();
			}else if(ca[i] instanceof TreeAbstract) {
				TreeAbstract tr=(TreeAbstract)ca[i];
				tr.ripen();
			}
		}
	}

}
