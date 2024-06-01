package genericexam.score;

public class MathScore implements Comparable<MathScore>{
	//인스턴스 필드
	String name;
	int score;
	
	//생성자
	public MathScore(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(MathScore o) {
		if(this.score<o.score) {
			return -1;
		}else if(this.score==o.score) {
			return 0;
		}else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return name+", "+ score;
	}
	
	
	
	

}
