package genericexam;

public class MathScore implements Comparable<MathScore>{
	String name;
	int score;
	
	public MathScore(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return name+", "+score;
	}

	@Override
	public int compareTo(MathScore o) {
		if(this.score>o.score) {
			return 1;
		}else if(this.score ==o.score) {
			return 0;
		}else {
			return -1;
		}
	}
	
	

}
