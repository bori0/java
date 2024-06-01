package exam.inherted1;

public class AnimalMain {

	public static void main(String[] args) {
		//객체 생성
//		Dog dog = new Dog("바둑이",2);
//		Cat cat = new Cat("까망이",5);

//		dog.cry();
//		dog.showInfo();
//		
//		dog.toString(); //문자열을 받아서 출력하고 싶으면 아래처럼 써서 출력
//		String result = dog.toString();
//		System.out.println(result);
//		
//		System.out.println();
//		
//		cat.cry();
//		cat.toString();
//		System.out.println(cat);
//		//print와 println은 참조변수를 주면 toString()호출
		
		Animal[] ani= {
				new Dog("뚱딴지",5),
				new Cat("뚱냥",2),
				new Bird("이슬이",4)
		};//자식은 부모가 될 수 있다 =다형성
		
//		Animal aniDog = new Dog("뚱딴지",4);
//		Animal aniCat = new Cat("뚱냥",5);
		
		for (int i = 0; i < ani.length; i++) {
			ani[i].cry();//부모것을 가져다 자식이 재정의
//			System.out.println("이름 : "+ani[i].name);//ERROR, 부모는 자식이 될수 없음
//									부모.자식 필드=부모는 부모영역에, 자식은 자식영역에 각각 가짐
//			위에 객체 생성을 했을 경우 : dog.name 또는 super.name으로 써야 호출됨
//			System.out.println("이름 : "+dog.name);
			
//			if(ani[i] instanceof Dog dog)
			if(ani[i] instanceof Dog) {
				Dog dogAni=(Dog)ani[i];//자식 >>부모 >>자식
				System.out.println("이름 : "+dogAni.name);
			}else if(ani[i] instanceof Cat) {
				Cat catAni=(Cat)ani[i];//자식 >>부모 >>자식
				System.out.println("이름 : "+catAni.name);
			}
		}//향상된 for문
	}

}
