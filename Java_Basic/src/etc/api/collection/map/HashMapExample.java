package etc.api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		/*
        # Map
        - Key / Value가 한 세트를 이루는 자료구조
        - Key값을 통해 Value를 참조하는 방식.
        - Key는 중복 저장을 허용하지 않는다.
        */
		
		// Map은 Key, Value 쌍을 이루기 때문에 멀티 제너릭을 설정
		Map<String, String> map = new HashMap<>();
		
		// Map에 데이터를 추가하는 메서드: put(Key, Value)
		map.put("강아지", "우주");
		map.put("고양이", "후추");
		map.put("햄스터", "먼지");
		System.out.println(map);
		
		// Map은 Key의 중복 저장을 허용하지 않습니다.
		// 만약 중복 Key를 사용하여 put을 호출하면 Value만 수정됩니다.
		map.put("강아지", "초코"); // Key 중복
		map.put("고먐이", "후추");
		System.out.println(map);
		
		// Map 내부의 Key의 존재 유무를 확인하는 메서드: containsKey(Key)
		System.out.println(map.containsKey("왕왕이"));
		
		// Map 내부의 값을 참조하는 법: get(Key)
		String name = "고냥이";
		if(map.containsKey(name)) {
			System.out.printf("%s의 이름은 %s입니다.\n", name, map.get(name));
		}else {
			System.out.println(name + "은(는) 없어용 ㅠㅠ");
		}
		System.out.println(map.get("왕왕이"));
		
		// Map의 크기를 확인하는 메서드: size()
		System.out.println("map의 크기는: " + map.size());
		
		// Map에서 Key들만 추출하는 메서드: keyset()
		// 모든 Key들을 Set에 담아서 반환합니다.
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + ": " + map.get(k));
		}
		System.out.println(map.keySet());
		
		// Map의 객체를 삭제: remove(key)
		// Key를 주시면 Value도 함께 제거됩니다.
		map.remove("고먐이");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
				
	}
	
}
