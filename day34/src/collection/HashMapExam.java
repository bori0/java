package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		//객체 지향/key, value
		map.put("신용권", 85);//같은 객체로 인식
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("신용권", 95);//같은 객체로 인식, 맨 마지막 값으로 저장됨
		System.out.println("총 Entry 수 : "+map.size());
		System.out.println("-----------1");
		
		//객체 찾기
		System.out.println("\t홍길동 : "+map.get("홍길동"));//점수를 얻고 싶으면 키 값 입력
		System.out.println(map.get("동장군"));//key로 value에 접근, key-name, value-score
		System.out.println("-----------2");
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // 키만 가져옴
		Iterator<String> keyIterator = keySet.iterator();//키만 가져와서
		while(keyIterator.hasNext()) {//꺼내는 작업
			String key = keyIterator.next();
			Integer value = map.get(key);//키로 value값을 가져옴
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println("-------------3");
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println(map.get("홍길동"));//null
		System.out.println("총 entry 수 : "+map.size());
		System.out.println("------------4");
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();//키와 value를 다 가져와서 처리하겠다
		for(Entry<String, Integer> ent : entrySet) {//향상된 for문으로 
			System.out.println(ent.getKey()+ent.getValue());
		}
		System.out.println("-----------5");
	}

}
