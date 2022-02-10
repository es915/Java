
public class Main {
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.move();
		d1.breeding();
		d1.cry();
		
		// 강아지 클래스는 동물 클래스를 상속받았으므로
		// 동물 클래스의 기능을 사용할수 있다.

	}	
}

class Animal {
	public void move() {
		System.out.println("움직이다");
	}
	
	public void breeding() {
		System.out.println("번식하다");
	}
}

// 강아지 클래스가 동물의 클래스를 상속 받는다(확장 받는다)
class Dog extends Animal {
	
	public void cry() {
		System.out.println("멍멍");
	}
	
}

//고양이 클래스가 동물의 클래스를 상속 받는다(확장 받는다)
class Cat extends Animal {
	
	public void cry() {
		System.out.println("야옹");
	}
	
}
