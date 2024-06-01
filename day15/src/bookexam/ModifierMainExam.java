package bookexam;

public class ModifierMainExam {

	public static void main(String[] args) {
		Modifiers modi = new Modifiers();
		
		//필드의 접근제한자 - private
//		System.out.println(modi.priName); //ERROR _ 클래스가 다르기 때문
//		System.out.println(modi.priAge);
		
		System.out.println(modi.defName);//제일 위에 패키지 이름만 같으면 ERROR 없음
		System.out.println(modi.defAge);
		modi.defAge = 20;
		modi.defName = "이강산";
		
		System.out.println(modi.pubName);//제일 위에 패키지 이름만 같으면 ERROR 없음
		System.out.println(modi.pubAge);
		modi.pubAge = 10;
		modi.pubName = "김신";
	}

}
