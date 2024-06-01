package staticmember.exam;

public class PenStatic {
	//#1.필드
	private String color; //인스턴스 필드 - 객체 속함, 힙에 저장
	
	//static : 공통으로 사용, 클래스영역(=데이터, 메소드 영역) 안에 생성
	//메소드 영역은 클래스가 메모리에 올라갈 때 메모리에 함께 선언
	//외부에서 사용할 때 :  클래스명.필드명   또는   클래스명.메소드명()
	
//	private static int count=0; //static필드 //클래스가 다른 곳에서 당겨쓸 수 없음
//	private static int allCount=0;//static필드
	static int count=0; //static필드 - 데이터영역에 저장되어 있고 힙에서 당겨서 씀
	static int allCount=0;//static필드
	
	//#2.생성자
	public PenStatic(String color) {
		this.color =color;
		
		//#2-1. 색상이 red인 것만 누적
		if(color.equalsIgnoreCase("red")) {
			count++;
		}
		
		//#2-2.객체 생성시마다 누적하기
		allCount++;
	}//생성자의 끝
	//     누적해서 쓰고 싶을 경우 static붙임 
	public static int getCount() {//인스턴스 필드 : 인스턴스 메소드에서는 static필드 호출해서 사용가능
						   //그러나 static 메소드에서는 인스턴스 필드로 호출할 수 없음
						   //인스턴스만 객체 생성 해주면 됨
		//private가 붙어서 이걸 쓰는거임
		//private가 아니면 쓸 필요 없음
		return count;
	}
	
	public static int getAllCount() {//인스턴스 필드
		return allCount;
	}
	
}
