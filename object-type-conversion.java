class Main {
	public static void main(String[] args) {
		Sonata so = new Sonata(); 
		so.drive();
		so.cruise();
		
		Santafe sa = new Santafe();
		sa.drive();
		sa.fourWheel();
		
		Car c1 = sa;
		// c1.fourWheel(); -> c1는 자동차이므로 sa의 메서드 사용 불가
		
		Santafe sa2 = (Santafe)c1; 
		// c1을 Car에서 Santafe로 형변환 하여 Santafe의 메서드 사용 가능
		sa2.fourWheel();
		
		// 에러 -> c1은 Santafe였던 sa를 담았기 때문에 Sonata와의 접점이 없음, 상속관계만 같음
		// Sonata so2 = (Sonata)c1;
		// so2.cruise();
		
    
	}
}

abstract class Car {
	abstract void drive();
}

class Sonata extends Car{
	void drive() {
		System.out.println("정상 주행중");
	}
	
	void cruise() {
		System.out.println("일정 속도를 유지하여 주행");
	}
}

class Santafe extends Car{
	void drive() {
		System.out.println("과속 주행중");
	}
	
	void fourWheel() {
		System.out.println("사륜 모드로 변경하여 주행");
	}
}
