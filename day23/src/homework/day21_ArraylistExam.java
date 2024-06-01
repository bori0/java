package homework;

import java.util.ArrayList;
import java.util.List;

public class day21_ArraylistExam {
	public static void main(String[] args) {
		List<String> list = new ArrayList<> ();
		ArrayList<String> list1 = new ArrayList<>();
		
		list.add("java");
		list.add("홍");
		list.add("김");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("list.size : "+list.size());
		
		System.out.println();//줄띄움
		
		
		list.add(2,"이");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("list.size : "+list.size());
		
		System.out.println();//줄띄움
		
		
		
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("list.size : "+list.size());
		
		System.out.println();//줄띄움
		
		list.clear();
		System.out.println("list.size : "+list.size());
	}
}
