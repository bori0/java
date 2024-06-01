package array;

public class StringExam1 {

	public static void main(String[] args) {
		// 
		String str1 = new String("홍길동");//힙1
		String str2 =  "홍길동";//힙2
		String str3 = "홍길동";//힙2
		String str4 = new String("홍길동");//힙3
		
		System.out.println(str1==str2);// false, 주소값을 비교하기 때문
		System.out.println(str2==str3);// true, 주소값을 비교하기 때문
		System.out.println(str1.equals("홍길동"));//true, 값을 비교하고 싶을 때
		System.out.println(str1.equals("김자바"));//false, 값을 비교하고 싶을 때
		System.out.println(str1.equals(str2));//true, 주소가 가리키는 곳의 값이 같은지 비교
		
		str2 += "님 즐거운 시간인가요?";//기존 객체는 버리고 새로운 객체를 생성한 다음 값을 저장
		
//		int a; a=a+3; //false, 초기 값이 없기 때문
		int a=0; a=a+3; //true
		
		String str5 = "hello java";
		System.out.println(str3.length());//3
		System.out.println(str5.charAt(2));//'l'
		
		System.out.println(str5.indexOf('j'));//6, j라는 특정문자가 인덱스의 몇 번째에 있는지 알아보는 것
		System.out.println(str5.indexOf('l'));//2
		System.out.println(str5.lastIndexOf('l'));//3 //뒤에서부터 해당되는 문자열을 찾는건데 숫자는 앞에서부터 세는거라 3임
		System.out.println(str5.indexOf("java"));//6, 시작점을 기준으로 알려줌
		
		String str6 = "java";
		String str7 = "홍길동";
		String str8= str1.concat(str2);
		System.out.println(str8);
	}

}
