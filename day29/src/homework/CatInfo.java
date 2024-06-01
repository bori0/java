package homework;

public class CatInfo {
	String name;
	int age;
	
	public CatInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void catInfo() {
		System.out.println(name+"는 "+age+"살 고양이입니다.");
	}
	
}
