
public class Main {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "그랜저";
		c1.speed = 180;
		c1.year = 2020;
		c1.introduce();
		c1.accel();
		
	}
}


class Car {
	String name;
	int speed;
	int year;
	
	public void accel() {
		System.out.printf("%s가 시속 %dkm로 달립니다\n", name, speed);
	}
	
	public void introduce() {
		System.out.printf("모델명 : %s, 속력 : %d, 연식 : %d\n", name, speed, year);
	}
}
