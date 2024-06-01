package collectionexam;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		long startTime;// 시스템에서 나노초 단위의 시간을 담을 변수
		long endTime;// 시스템에서 나노초 단위의 시간을 담을 변수
		
		startTime = System.nanoTime();
				for (int i = 0; i <10000; i++) {
					list1.add(0, String.valueOf(i));
							//0번 칸에 무슨 값을 넣어라 >> 뒤로 갈수록 시간이 걸림
								//String.valueOf(i) : 정수 i의 값을 문자열로 변환
				}
		endTime = System.nanoTime();
		System.out.println(" ArrayList 걸린 시간 : "+(endTime-startTime)+" ns");
		
		
		startTime = System.nanoTime();
		for (int i = 0; i <10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : "+(endTime-startTime)+" ns");
	}

}
