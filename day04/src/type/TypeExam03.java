package type;

public class TypeExam03 {

	public static void main(String[] args) {
		double avg =35/3; //자동 형변환(up casting)
		                  //실수=정수로 적으면 실수로 나옴
//		int sum = 35.0/3; //정수=실수, 에러
		                  //정수가 작기 때문에 실수를 넣을 수 없음
		int sum = (int)(35.0/3); //강제 형변환(down castiong)을 하고 싶을 경우
		                         //자료손실 있음
		                         //작은 그릇에 담고 나머지는 버리라는 의미
		
		System.out.println(avg); //11.0
		System.out.println(sum); //11
		
		
		int kor=90;
		String name = "홍길동";
		String name1 = new String("홍길동"); //new라고 안 쓰면 모두 똑같은 주소가 나옴
		
		System.out.println(kor==90); //true
		System.out.println(name==name1); //false
		System.out.println(name=="홍길동"); //true
		System.out.println(name.equals("홍길동")); //true, 문자열을 비교하기 위해서 equals를 꼭 써야함
		
		boolean var = true;
	}

}
