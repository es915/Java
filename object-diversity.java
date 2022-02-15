class Main {
  public static void main(String[] args) {
   
    
    Weapon w1 = new Sword();
    w1.attack();
    // 출력 : 칼로 공격합니다.

    w1 = new Bow();
    w1.attack();
    // 출력 : 활로 공격합니다.
    
    System.out.println();
    
    Warrior warrior = new Warrior(); 

    warrior.age = 20;
    warrior.name = "홍길동";

    warrior.weapon = new Bow();
    warrior.attack();    
    // 홍길동이 활로 공격합니다.
    
    warrior.weapon = new Sword();
    warrior.attack();
    // 홍길동이 칼로 공격합니다.
    
    warrior.chageBow();
    warrior.attack();
    
    warrior.chageSword();
    warrior.attack();
   
  }
}

class Weapon {
	void attack() {
		System.out.println("무기로 공격합니다");
	}
}

class Sword extends Weapon {
	void attack() {
		System.out.println("칼로 공격합니다");
	}
}

class Bow extends Weapon {
	void attack() {
		System.out.println("활로 공격합니다");
	}
}

class Warrior {
	int age;
	String name;
	Weapon weapon;
	
	void attack() {
		System.out.print("홍길동이 ");
		weapon.attack();
	}
	
	void chageSword() {
		this.weapon = new Sword();
	}
	
	void chageBow() {
		this.weapon = new Bow();
	}
	
}
