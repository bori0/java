package genericexam;

public class EnglishScore implements Comparable<EnglishScore>{
	String name;
	int score;
	
	public EnglishScore(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(EnglishScore o) {
		if(this.score >o.score) {
			return 1;
		}else if(this.score==o.score) {
			return 0;
		}else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return name+", " + score ;
	}


	
	
	
}
