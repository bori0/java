package collectionexam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackDishMan {

	public static void main(String[] args) {
		//Dish 객체를 담을 Stack 컬렉션 생성
		Stack<Dish> dish = new Stack<>();
		
		//접시 쌓기 -push(넣기), pop(꺼내기), peek() 가장 위의 내용 확인
		//후입선출
		dish.push(new Dish(1));
		dish.push(new Dish(2));
		dish.push(new Dish(3));
		dish.push(new Dish(4));
		dish.push(new Dish(5));
		
		//접시 꺼내기 - pop, 가장 마지막에 저장한 것을 먼저 꺼냄, LIFO
		while(!dish.empty()) {
				// : 본인거, 비어 있지 않으면 꺼내기
				// dish.isempty() : 부모, vector거
			System.out.println("가장 위 접시 확인 : "+dish.peek().getValue());
			Dish dishObject = dish.pop();
			//객체 타입을 꺼내오기 때문에 Dish 타입을 씀
			System.out.println("가장 위 접시 꺼냄 : "+dishObject.getValue());
			System.out.println();
		}
		
		System.out.println(" +++Queue+++ ");
		Queue<Dish> dishQueue = new LinkedList<>(); // Queue는 인터페이스
		
		//접시 쌓기 - offer(저장), poll(꺼내기), peek(확인), FIFO
		//			선입선출
		dishQueue.offer(new Dish(1));
		dishQueue.offer(new Dish(2));
		dishQueue.offer(new Dish(3));
		dishQueue.offer(new Dish(4));
		dishQueue.offer(new Dish(5));
		
		//접시 꺼내오기
		while(!dish.isEmpty()) {
			System.out.println("가장 아래 접시 확인 : "+dishQueue.peek().getValue());
			System.out.println();
			Dish dishQueueObject = dishQueue.poll();
			System.out.println("가장 아래 접시 꺼내오기 : "+dishQueueObject.getValue());
		}
	}

}
