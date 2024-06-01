package homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {
	
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 지향 / key,value
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 84);
		map.put("신용권", 40);
		System.out.println("총 entry :"+ map.size());
		System.out.println("--------1");
		
		//객체 찾기
		System.out.println("\t홍길동 : "+map.get("홍길동"));
		System.out.println(map.get("신용권"));
		System.out.println("====2");
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();//키만 가져옴
		Iterator<String> keyIterator = keySet.iterator();//키만 가져와서
		while(keyIterator.hasNext()) {//꺼내는 작업
			String key = keyIterator.next();
			Integer value = map.get(key);//키로 value 값을 가져옴
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println("===3");
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println(map.get("홍길동"));//null
		System.out.println("총 entry : "+map.size());
		System.out.println("===4");
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();//키와 value를 다 가져와서 처리
		for(Entry<String,Integer> ent : entrySet) {//향상된 for문으로
			System.out.println(ent.getKey()+ent.getValue());
		}
		System.out.println("======5");
	}
}
