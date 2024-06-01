package abstract1;

public class Dog extends Animal{

	@Override//재정의, 부모거 고쳐쓰는 것
	public void cry() {
		System.out.println("왈왈!");
	}

}
