package modifier1;

import accessmodifier.sample.testexam.Aaa;//Ctrl Shift o
//import accessmodifier.test1.exam1.Aaa;//ERROR, 클래스 이름이 Aaa로 같아서 

public class importExamMain {

	public static void main(String[] args) {
		Aaa aaa = new Aaa();//ERROR 1.패키지 이름이 다르다
		//							2.클래스 이름이 같아서 어떤걸 골라야할지 모름
		
//		accessmodifier.sample.testexam.Aaa aaa = new accessmodifier.sample.testexam();
//		Aaa aaa = new Aaa();
//		Ccc Ccc = new Ccc();//ERROR, Ccc클래스가 디폴트 클래스라서
		//이름이 같은 것을 쓰고 싶으면 하나는 풀네임, 하나는 축약형
		accessmodifier.test1.exam1.Aaa testAaa = new accessmodifier.test1.exam1.Aaa();
		
		aaa.setName("김자바");
		testAaa.setName("홍길동");
		
		System.out.println(aaa.getName());
		System.out.println(testAaa.getName());

	}

}
