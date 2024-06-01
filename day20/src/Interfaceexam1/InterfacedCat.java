package Interfaceexam1;

public class InterfacedCat implements InterfaceAnimal{
//				자식클래스가 완성시키겠다 부모인터페이스를		

	
	@Override//재정의, 부모것을 고쳐 사용
	public void cry() {
		System.out.println("야올~");
	}

	@Override
	public void fly() {
		
	}

}
