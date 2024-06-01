package homework;

import java.util.ArrayList;
import java.util.List;

public class day21_board {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<> ();
		
		list.add(new Board("1","1","1"));
		list.add(new Board("2","2","2"));
		list.add(new Board("3","3","3"));
		list.add(new Board("4","4","4"));
		
		for (int i = 0; i < list.size(); i++) {
			Board b=list.get(i);
			System.out.println(b.getSubject()+", "+b.getContent()+", "+b.getWriter());
		}
		for(Board bo: list) {
			System.out.println(bo);
		}
	}

}
