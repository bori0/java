package accessmodifier.test1.exam1;

public class Aaa {
	private String name;
	private String age;
	private int score;
	
	public Aaa() {
		super();
	}

	public Aaa(String name) {
		super();
		this.name = name;
	}
	
	public Aaa(String name, String age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
//	public int getScore() {
//		return score;
//	}

}
