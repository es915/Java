
public class Main {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.setInfo("홍길동", 20, "서울");
		p1.getInfo();

	}	
}

class Person {
	
	// 접근제어자 (public, private)를 이용한 캡슐화
	
	private int age;
	private String name;
	private String address;
	
	// 생성자
	Person() {
		System.out.println("사람 생성");
	};
	
	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("설정 완료");
	}
	
	public void getInfo() {
		System.out.printf("이름 : %s, 나이 : %d, 거주지 : %s\n", name, age, address);
	}
}
