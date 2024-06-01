package polymorphism.animal;

public class AnimalMain2 {

	public static void main(String[] args) {
//		Animal ani=new Animal();
//		Cat cat = new Cat("김야옹", 3);
//		Dog dog = new Dog("박멍멍", 2);
//		Bird bird = new Bird("최짹짹", 4);
//		
//		ani.cry();
//		cat.cry();
//		dog.cry();
//		bird.cry();
//		System.out.println();

		//배열은 같은 타입의 자료를 저장하는 공간
		Animal[] aniArry= {//자식은 부모타입에 담을 수 있다. 부모는 자식 타입에 담을 수 없다.
				new Animal(),
				new Cat("김야옹", 3),
				new Dog("박멍멍", 2),
				new Bird("최짹짹", 4)
		};//end of aniArry
		
		//출력하기
		for(int a=0; a<aniArry.length; a++) {
			aniArry[a].cry();
		}
//		aniArry.showInfo(); //ERROR
	//  부모타입.자식 메소드라서 실행할 수 없음
	//  자식이 부모타입으로 이미 타입변환을 한 상태라서 부모타입만 사용할 수 있다
	//단, 오버라이딩된 메소드는 자식 것을 사용
	
		
	//#1버전
	//  자식 >> 부모 >> 자식
	// 부모가 자식이 될 수 있는지 검토하는 연산자 : instanceOf
	// (boolean result = )객체 instaceOf 타입; >> 타입변환 가능 >> true,
	//										   >> 		 불가능 >> false
	//	자식타입 참조변수 = (자식타입)부모타입;
	
		
	//#2.버전
	// java12 버전부터는
	// 객체 instanceOf 자식타입 참조변수;
		
	
		//Cat의 자료를 사용하기 위해
		// -현재는 Cat가 부모타입으로 타입변환되어 있어서
		//  순수 Cat의 메소드와 필드를 사용할 수 없는 상태
		//  Cat만이 가지고 있는 메소드와 필드, 부모의 메소드와 필드를 사용하고 싶을 때
		
		//#방법1
		if(aniArry[1] instanceof Cat) {
			Cat cat = (Cat)aniArry[1];//강제 타입변환, 다운캐스팅
			cat.showInfo();
		}else {
			System.out.println("타입변환 불가");
		}
		
		//#방법2
		if(aniArry[1] instanceof Cat cat) {
			cat.showInfo();
		}else {
			System.out.println("타입변환 불가");
		}
		
//		Cat cat1 = new Animal();//자식은 부모가 될 수 없어서 오류
//		Cat cat2 = (Cat)new Animal();//형변환이 안 될 수 있어서 오류
//		Animal ani = new Animal();
//		ani instanceOf Cat
		
	}//end of main

}
