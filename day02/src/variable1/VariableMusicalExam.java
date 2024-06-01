package variable1;

public class VariableMusicalExam {

	public static void main(String[] args) {
		//#1.변수 선언
		String musical= "시스터 액터"; //뮤지컬명
		String name = "홍길동"; //관람자 이름
		int year=2024;  // String watchDate="2024-01-02";로 합쳐서 써도 되는군
		int month = 1;
		int day = 2;
		int hour=2;// String performanceTime="2시간 30분";
		int min=30;
		
		//#2.화면에 출력
		System.out.println("** "+musical+" 뮤지컬 관람 정보 **");
		System.out.println("공연 관람자 :" + name);
		System.out.println("공연 관람일 :" + year +"-"+month +"-"+day);
		System.out.println("공연 시간 :" + hour +"시간 "+min +"분");
		
	}

}
