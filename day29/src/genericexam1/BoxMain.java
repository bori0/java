package genericexam1;

public class BoxMain {

	public static void main(String[] args) {
		Box<String, Integer> box = new Box<>();
		box.setName("홍길동");
		String name = box.getName();
		box.setAge(25);
		int age = box.getAge();
		
		System.out.println(name);
		System.out.println(age);
		
		Box<Integer, Integer> box1 = new Box<>();
		box1.setName(78);
		int name1 = box1.getName();
		box1.setAge(50);
		int age1 = box1.getAge();
		
		System.out.println(name1);
		System.out.println(age1);
		
		Box<Animal, String> box2 = new Box<>();
		box2.setName(new Animal());
		Animal ani = box2.getName();
		
		Box<String, String> box3 = new Box<>();

	}

}
