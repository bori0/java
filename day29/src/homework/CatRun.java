package homework;

public class CatRun extends CatInfo{

	public CatRun(String name, int age) {
		super(name, age);
		
	}
	public void catRun() {
		System.out.println(name+"가 담장 위를 뛰어가고 있습니다.");
	}

}
