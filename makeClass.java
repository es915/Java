
public class exam {

//	public static void introduce(int age, String home, String name) {
//		System.out.printf("%s에 사는 %d살 %s입니다!!!!\n", home, age, name);
//	}
//	
//	public static void addAge(int age, String name) {
//		int addedAge = age + 1;
//		System.out.printf("%s의 나이가 %d에서 %d로 한살 먹었습니다.\n", name, age, addedAge);
//	}
	
	public static void main(String[] args) {
		
		// 사람 - 나이, 이름, 고향
		// 자기소개, 나이먹기
		
		// 한 사람을 표현하기 위해 세개의 데이터.		
	
		
		// 구조화 -> 프로그래밍 구조화하는 작업이다.
		
		// 하나의 구조를 만들었으면 그 구조의 복사본을 만들어서 사용하자.
//		Person.introduce();
//		Person.addAge();
		
		// Person 복사본 만들기.
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.introduce();
		p1.addAge();		
		
		p2.introduce();
		p2.addAge();
		
		p3.introduce();
		p3.addAge();
		// 사람의 기능 -> 자기소개
		//introduce(age, home2, name);
		
		
//		introduce(age2, home2, name2);
//		
//		addAge(age2, name2);
		
		
		// 데이터가 다르고 절차나 구조가 같으면 이건 같은거다. => 재활용
		// 값을 재활용 -> 변수
		// 절차를 재활용 -> 함수
		// 변수랑 함수의 구조를 재활용 -> 클래스와 객체
	
	}
	
}

// 사람 클래스 -> 데이터구조 + 함수
class Person {
	
	int age = 20;
	String name = "홍길동";
	String home = "대전";
	
	public void introduce() {
		System.out.printf("%s에 사는 %d살 %s입니다!!!!\n", home, age, name);
	}
	
	public void addAge() {
		int addedAge = age + 1;
		System.out.printf("%s의 나이가 %d에서 %d로 한살 먹었습니다.\n", name, age, addedAge);
	}
	
}
