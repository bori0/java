package inheritance.exam2;

public class Dog extends Animal{
	int age = 3;
	
	public Dog(String name) {
		super(name);//부모의 생성자 호출
					//부모생성자 중에 매개변수를 하나 받은걸 호출하라
					//public Animal() {}>> 매개값을 받아서 호출에 응해줄 것이 없어서 ERROR
		//public Animal(String name) {this.name=name;} >> 부모에 써주면 괜찮다.
		//super.필드명 >> 
	}
	//#강아지만 가진 기능
	public void run() {
		System.out.println(name+" 가 달린다.");
		System.out.println(name+" 는 "+super.age+"살이다.");
		//super.age : 부모의 age
	}
	@Override//재정의 , 부모것을 자식이 고쳐쓴다.
			 //생략 가능하나 웬만하면 다 쓰는걸로
			 //상속을 받았다는 것을 알 수 있음, 컴파일러가 체킹을 해줘서 오타날 확률이 줄어든다.
	public void cry() {
		System.out.println("멍멍");
	}
}
