package bookexam;

public class Exam3_2_11__ {

	public static void main(String[] args) {
		int a=3;
		int b=7;
		int c=3;
		
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		System.out.println(a==c); //true
		
		String name1 ="홍길동";
		String name2 =new String("홍길동");
		
		System.out.println(name1==name2); //false, 주소값 비교
		System.out.println(name1.equals(name2)); //true, 내용비교
		       // equals() : 문자열의 내용 비교, 대소문자 구분
		System.out.println(name1.equalsIgnoreCase(name2)); //true
		//equalsIgnoreCase() : 대소문자 구분하지 않고 비교

	}

}
