package genericexam;

public class Box {
	
	private Object obj;//참조변수, 이 안에 int, String, Car타입, 모든 타입을 담을 수 있다.
						//모든 것들의 조상이기 때문
	
	public void set(Object obj) {
		this.obj=obj;
	}

	public Object get() {
		return obj;
	}
}
