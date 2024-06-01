package genericexam;

public class Box2<V,K> {
	
	private V name;
	private K age;
	
	public void setName(V name) {
		this.name=name;
	}

	public V getName() {
		return name;
	}

	public K getAge() {
		return age;
	}

	public void setAge(K age) {
		this.age = age;
	}
	
}
