package genericexam;
//제네릭 클래스<타입>
public class BoxGeneric <T> {
	private T name;
	private T kind;
	
	public void set(T name) {
		this.name =name;
	}
	
	public T get() {
		return name;
	}
	public void show() {
		System.out.println(name+", "+kind);
	}
}
