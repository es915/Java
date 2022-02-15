class Main {
  public static void main(String[] args) {
    
	System.out.println();
    System.out.println("청둥 오리");
    청둥오리 a청둥오리 = new 청둥오리();
    a청둥오리.날다();
    a청둥오리.헤엄치다();
    // 출력 : 오리가 날개로 날아갑니다.
    // 출력 : 오리가 오리발로 헤엄칩니다.
    
    System.out.println();
    System.out.println("흰 오리");
    흰오리 a흰오리 = new 흰오리();
    a흰오리.날다();
    a흰오리.헤엄치다();
    // 출력 : 오리가 날개로 날아갑니다.
    // 출력 : 오리가 오리발로 헤엄칩니다.

    System.out.println();
    System.out.println("고무 오리");
    고무오리 a고무오리 = new 고무오리();
    a고무오리.날다();
    a고무오리.헤엄치다();
    // 출력 : 저는 날 수 없어요. ㅜㅠ
    // 출력 : 오리가 둥둥 떠다닙니다.

    System.out.println();
    System.out.println("고무 오리");
    고무2오리 a고무2오리 = new 고무2오리();
    a고무2오리.날다();
    a고무2오리.헤엄치다();
    // 출력 : 저는 날 수 없어요. ㅜㅠ
    // 출력 : 오리가 둥둥 떠다닙니다.
    
    System.out.println();
    System.out.println("아수라 오리");
    아수라오리 a아수라오리 = new 아수라오리();
    a아수라오리.날다();
    a아수라오리.헤엄치다();
    // 출력 : 오리가 날개로 날아갑니다.
    // 출력 : 오리가 둥둥 떠다닙니다.
  }
}

abstract class 날개 { // 추상 함수를 내포하고 있을경우 클래스에도 abstract를 붙여야함
	abstract void 사용(); // 추상 메서드, 오버라이딩을 위한 함수 -> 오버라이딩 필수.
						 // 날개를 사용하기 위해서는 "사용" 메서드를 무조건 오버라이딩을 해야함
	void 사용2() { // 일반 메서드는 그대로 상속됨, but 추상 매서드는 오버라이딩 해야함
		
	}
}

class 일반날개 extends 날개{
	void 사용() {
		System.out.println("오리가 날개로 날아갑니다");
	}
}

class 고무날개 extends 날개{
	void 사용() {
		System.out.println("오리가 날개로 날수 없습니다");
	}
}
abstract class 발 {
	abstract void 사용(); // 추상 메서드는 상속받을 클래스에게 정의하라고 하는거기에 메서드 안의 내용 X
}

class 일반발 extends 발{
	void 사용() {
		System.out.println("오리가 발로 헤엄칩니다");
	}
}
class 고무발 extends 발{
	void 사용() {
		System.out.println("오리가 둥둥 떠다닙니다");
	}
}


class 오리 {
	
	protected 날개 a날개 = new 일반날개(); // protected : 상속 관계 외의 접근 불가
	protected 발 a발 = new 일반발();
	
	void 날다() {
		a날개.사용();
	}  
	
	void 헤엄치다() {	
		a발.사용();
	}
}

class 흰오리 extends 오리 {
	흰오리() {
		a날개 = new 일반날개();
		a발 = new 일반발();
	}
}

class 청둥오리 extends 오리 {
	청둥오리() {
		a날개 = new 일반날개();
		a발 = new 일반발();
	}
}

class 고무오리 extends 오리 {
	고무오리() {
		a날개 = new 고무날개();
		a발 = new 고무발();
	}
}

class 고무2오리 extends 고무오리 {
	고무2오리() {
		a날개 = new 고무날개();
		a발 = new 고무발();
	}
}

class 아수라오리 extends 오리 {
	아수라오리() {
		a날개 = new 일반날개();
		a발 = new 일반발();
	}
}





