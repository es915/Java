public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Animal a1 = new Animal();
		
		Animal[] animals = {d1, c1, a1};
		
		for(int i=0; i<animals.length; i++) {
			animals[i].breath();
		}

	}
}

class Animal {
	void breath() {
		System.out.println("숨쉬다");
	}
}

class Dog extends Animal{
	// 상위 객체의 함수를 재정의함 -> 오버라이딩
	void breath() {
		System.out.println("강아지가 숨쉬다");
	}
}

class Cat extends Animal {
	void breath() {
		System.out.println("고양이가 숨쉬다");
	}
	
}
