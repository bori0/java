package class1;

//설계도, 붕어빵 틀 같은 것			시작
public class Student {
	//#1.필드(멤버변수) : 속성, class 안에 들어와 있는 것, 힙에 들어와 있는 것
	String name ;//지역변수는 main, for문, 스택에 들어와 있는 것
	int age;
	int score;//패키지 바뀌면 못 씀
	
	//#2. 생성자 - 객체를 초기화
	//				기본 생성자는 생략이 가능 - 생략하면 컴파일시 컴파일러가 만들어 사용
	public Student(){//있는게 좋다! class 이름이랑 똑같아야 쓸 수 있음!!
		//초기화 필요한 문항
	}
	
	//#3. 메소드 - 동작방식, 기능처리, 처리역할
	public void gotoSchool() {
		System.out.println(name+"이(가) 학교에 간다.");//메소드 밖에서 출력 안 됨
	}
}//							설계도 끝
