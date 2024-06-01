package homework;

public class Exam7 {

	public static void main(String[] args) {
		CatInfo ci = new CatRun("야옹이", 5);
		
		ci.catInfo();
		if(ci instanceof CatRun cr) {
			cr.catRun();
		}
		
	}

}
