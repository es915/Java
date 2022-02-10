
class Main {
  public static void main(String[] args) {
	  
	  // 구성품 선언
	  Wing w1 = new Wing();
	  Foot f1 = new Foot();
	  
	  Duck d1 = new Duck(w1, f1);
	  
	  d1.fly();
	  d1.walk();
    
  }
}

class Wing {
	public void use() {
		System.out.println("날개로 날다");
	}
}

class Foot {
	public void use() {
		System.out.println("두발로 걷다");
	}
}

class Duck {
	Wing wing; // 오리에 연결 시킬 구성품(객체)를 선언
	Foot foot;
	
	Duck(Wing wing, Foot foot) { // 생성자를 만들때 매개변수로
		this.wing = wing;		 // 어떤 구성품을 사용할지 받음
		this.foot = foot;
	}
	
	public void fly() {
		wing.use();
	}
	
	public void walk() {
		foot.use();
	}
}
