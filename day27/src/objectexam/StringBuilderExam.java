package objectexam;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("안녕");
		str.append(" 즐거운 시간");
		str.append("  자바는 즐거워");
		
		System.out.println(str);
		
		str.delete(1, 6);//그 번호 앞까지만 해당됨 1<=x<6
		System.out.println(str);
	}//메인 끝

}
