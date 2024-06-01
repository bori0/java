package exam.inherted2;
						//Adapter : 중간역할
public abstract class CatAdapter implements Animalinterface{
//	interface에 아무것도 안 적혀있다고 파일정리할 때 싹 지우면 안 됨
//	묶기 위해 interface를 해놓은 경우도 있기 때문
	@Override
	public abstract void cry();

	@Override
	public abstract void show();

	//아래 두개만 구현하고 위의 두개는 Cat에서 구현
	@Override
	public void print() {
		
		
	}

	@Override
	public void info() {
		
		
	}

}
