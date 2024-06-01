package staticmember.exam;

public class Pen {
	//#1. 필드
	private String color;
	private int count;
	private int allCount;
	
	//#2.생성자
	public Pen(String color) {
		this.color= color;//아래로 가게 되면 this.color를 쓸 때 주의해야한다.		
		
//		if(this.color.equals("red")) //소문자 비교
								//this.color를 초기화 했기 때문에 this.color나 color는 똑같
		if(color.equalsIgnoreCase("red")) { //대소문자 구분하지 않고 비교
			count++;//red pen의 개수를 누적
		}
		allCount++;//전체 pen의 개수 누적, 전체 객체 생성 개수
	}

	public String getColor() {//privat로 설정된 필드 외부에서 읽어서 이용할 수 있도록 pivate필드 호출해서 리턴
							  //getter : 외부에서 읽어는 가되 고치지 못하게
		return color;
	}
	
	//개별 pen
	public int getCount() {
		return count;
	}

	//전체 pen 건수
	public int getAllCount() {
		return allCount;
	}
	
}
