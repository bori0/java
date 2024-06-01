package listexam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListexam {

	public static void main(String[] args) {
		//컬렉션은 대부분 부모타입으로 받아서 씀
//		List<String> arrayList = new ArrayList<String>();//자식은 부모가 될 수 있다
									//LinkedList, vector...등 들어올 수 있다
		ArrayList<String> arrayList = new ArrayList<String>();//자식 부모 왔다갔다하는거 다형성
		String[] arrStr = new String[5];
		
		//자료를 추가 add(데이터)
		arrayList.add("사과");
		arrayList.add("바나나");
		arrayList.add("용과");
		arrayList.add("레몬");
		
		//저장된 자료의 개수를 확인
		int size = arrayList.size();//배열이라면 - arrStr.length  - 
		System.out.println("자료 크기 : "+size);
		
		//자료의 내용을 출력
		//배열은 arrStr[i] 이렇게 출력
		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList[i]); //배열만 가능한 형식
			System.out.print(arrayList.get(i)+" "); //List 출력 형식
		}
		
		System.out.println();
		for(String str : arrayList) {//향상된 for문
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.println();
		
		//위치를 정해 추가
		arrayList.add(1, "수박");
		System.out.println("자료의 크기 : "+arrayList.size());
		
		for(String str : arrayList) {//향상된 for문
			System.out.print(str+" ");
		}
		System.out.println();
		
		System.out.println("수박 입력후 2번째 출력");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("2번 인덱스 삭제 후 출력");
		//자료를 삭제, 특정 위치의 자료를 삭제
		arrayList.remove(2);
		for(String str : arrayList) {// 향상된 for문
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("2번 인덱스 삭제 후 출력2");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("자료를 다 삭제하면?");
		//자료를 다 삭제
		arrayList.clear();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i)+" ");
		}// [] 안 뜸
		System.out.println();
		System.out.println("자료 삭제 후 자료 갯수");
		System.out.println(arrayList.size());
		
		//자료를 추가 add(데이터)
		arrayList.add("사과");
		arrayList.add("바나나");
		arrayList.add("용과");
		arrayList.add("레몬");
		
		//iterator() 메소드 - 반복자
		//hasNext() : 다음 원소의 존재 여부, 자료(원소)가 있으면 true, 없으면 false
		//next() : 다음 원소를 반환
		// = 향상된 for문을 더 많이 쓰는 추세, 밑의 형식은 잘 쓰지 않는다.
		Iterator<String> iter = arrayList.iterator();
		
		//출력
		while(iter.hasNext()) {//있는지 검토를 해서     0을 살피고 next, 1을 살피고 꺼내고, 2을 살핌
			System.out.print(iter.next()+" ");//가져와
		}
		
		
	}
		
}


