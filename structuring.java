class exam {
	
	public static void main(String[] args) {
		
		// 사람 - 나이, 이름, 고향
		// 구조화
		Person.introduce();
		Person.addAge();
		
		// Person을 복사해 p1에 넣음
		Person p1 = new Person();
		// Person을 복사해 p2에 넣음
		Person p2 = new Person();
		// 객체를 하나 만들어놓으면 여러번 사용이 가능함.
		
	}
}

class Person {
	static int age = 20;
	static String name = "홍길동";
	static String home = "대전";
	
	public static void introduce() {
		System.out.printf("%s에 사는 %d살 %s입니다\n", home, age, name);
	}
	
	public static void addAge() {
		System.out.printf("%s가 나이를 먹어 %d살이 됬습니다\n", name, age+1);
	}
}
