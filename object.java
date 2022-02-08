
public class Main {
	public static void main(String[] args) {
		
		// 객체 -> 데이터 + 함수 의 집합
		// 객체 -> 상태 + 동작 사물이나 개념
		// 클래스와 객체 -> 클래스 틀 (개념적인것), 객체 실체
		
		// 자동차 -> 소나타, 아반떼, 모닝
		// 축구선수 ->호날두, 손흥민, 메시
		// 음식 -> 짜장면, 피자, 탕수육 
		
		Car c1 = new Car();
		c1.model = "람보르기니";
		c1.speed = 300;
		
		c1.drive();
		
		Car c2 = new Car();
		c2.model = "페라리";
		c2.speed = 300;
		
		Car c3 = new Car();
		c3.model = "마세라티";
		c3.speed = 300;
		
		Car[] cars = new Car[3];
		
		cars[0] = c1;
		cars[1] = c2;
		cars[2] = c3;
		
		for(int i=0; i<cars.length; i++) {
			cars[i].drive();
		}
		
	}
}

class Car {
	int speed;
	String model;
	
	public void drive() {
		System.out.printf("%s가(이) 시속 %dkm로 달립니다\n", model, speed);
	}
}
