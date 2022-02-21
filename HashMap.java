import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		// ArrayList -> 배열의 확장
		// HashMap -> 유사 객체, cpp의 Map과 유사 -> key - value 한쌍

		// 선언
		HashMap<String, Object> personMap = new HashMap<>();
		
		// 저장 (key - value)
		personMap.put("name", "홍길동");
		personMap.put("age", 20);
		
		// 가져오기 key를 넣으면 value가 나옴
		// object로 value를 받아 형변환을 해줘야함
		System.out.println((String)personMap.get("name"));
		System.out.println((int)personMap.get("age"));
		
		// 수정 : 키의 중복 허용 X -> 이미 존재하는 key가 있을경우 value가 덮어짐
		personMap.put("name", "이순신");
		System.out.println(personMap.get("name"));
	}

}ㅍ
