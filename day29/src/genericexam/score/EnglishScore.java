package genericexam.score;
						//항상 포함되어 있지만 생략되어있음
public class EnglishScore extends Object implements Comparable<EnglishScore>{
	//필드-인스턴스 필드(객체가 생성되어야 메모리에 올라감)
	String name;
	int score;
	//인터페이스는 부모자식으로 끝나고 class처럼 object가 있는게 아님
	//생성자 - 객체 초기화, 생성자 없으면 객체를 만들 수 없다.
	//			생성자 없으면 기본 생성자를 컴파일러가 컴파일시 삽입
	public EnglishScore(String name, int score) {
		super();//Object 클래스를 초기화
		this.name = name;
		this.score = score;
	}
	
	
	
	@Override//재정의, Comparable의 단 하나인 추상메소드
	public int compareTo(EnglishScore o) {
		if(this.score>o.score) {
			return 1;
		}else if(this.score==o.score) {
			return 0;
		}else {
			return -1;
		}
	}
	
	@Override//재정의 , Object의 toString()을 오버라이딩
	public String toString() {
			//넘겨줄 값의 타입
		return name+","+score;
	}


}
