// 문제 : 아래가 오류없이 실행되도록 해주세요.
// 조건 : 사람 클래스만 수정할 수 있습니다.

class Main {
  public static void main(String[] args) {
    new Person();
    // 아래와 같이 출력되게 해주세요.
    
    // 동물(String 이름, int 나이) 실행됨!
    // 이름 : 홍길동
    // 나이 : 27
  }
}

class Animal {
 
	Animal(String name) {
	    System.out.println("동물(String 이름) 실행됨!");
	    System.out.println("이름 : " + name);
	}
	Animal(String name, int age) {
	    System.out.println("동물(String 이름, int 나이) 실행됨!");
	    System.out.println("이름 : " + name);
	    System.out.println("나이 : " + age);
	}	
}

class Person extends Animal {
	Person() {
		super("홍길동", 27); // 최상위 클래스의 생성자를 사용함 매개변수로 어떤 생성자를 사용할지 결정함
	}
}
