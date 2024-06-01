package collection;

import java.util.Objects;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//미완성이거나, 생성자가 private이면 힙에 올릴 수 없어서 객체를 생성할 수 없다.

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	@Override
	public int compareTo(Person o) {
		if(age>o.age) {
			return 1;
		}else if(age == o.age){
			return 0;
		}else {
			return -1;
		}
		
	}
}
