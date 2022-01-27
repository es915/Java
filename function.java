public class exam {

	public static void func() {
		System.out.println("run function1");
		System.out.println("run function2");
		System.out.println("run function3");
		System.out.println("run function4");
		System.out.println("run function5");
	}
	
								// 매개변수
	public static void multiTable(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
	
	
    public static void main(String[] args) {
    	
//    	System.out.println("run function1");
//		System.out.println("run function2");
//		System.out.println("run function3");
//		System.out.println("run function4");
//		System.out.println("run function5");
//    	
//		// 코드를 줄여 효율적으로 코딩을 함
//    	func();
//    	func();
//    	func();
//    	func();
    	
    	// 구구단 함수
    	multiTable(3);

    }
}
