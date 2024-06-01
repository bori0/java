package bookexam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체 수 : "+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : "+skill);
		System.out.println();
		
		for (int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.print(i+" : "+str+" ");
		}
		System.out.println();
		
		System.out.println("2번 지움1");
		list.remove(2);
		for (int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.print(i+" : "+str+" ");
		}
		System.out.println();
		
		System.out.println("2번 지움2");
		list.remove(2);
		for (int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.print(i+" : "+str+" ");
		}
		System.out.println();
		
		System.out.println("문자열 지움");
		list.remove("iBATIS");
		for (int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.print(i+" : "+str+" ");
		}
	}

}
