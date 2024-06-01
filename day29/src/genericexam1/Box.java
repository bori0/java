package genericexam1;

public class Box<V,K> {
	
	private V name;
	private K age;
	
	public void setName(V name) {
		this.name=name;
	}

	public V getName() {
		return name;
	}

	public void setAge(K age) {
		this.age = age;
	}
	
	public K getAge() {
		return age;
	}
	
}
