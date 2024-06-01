package exam;

public class TreeAbstract extends CountableAbstract{

	public TreeAbstract(String name, int num) {
		super(name, num);
	}

	@Override
	public void count() {
		System.out.println(name+"가 "+num+"그루 있다.");
	}

	public void ripen() {
		System.out.println(name+"에 열매가 잘 익었다.");
	};
}
