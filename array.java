import java.util.Scanner;

public class exam {
	
	public static void main(String[] args) {
	
		// 배열
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		
		// 배열안에 들어갈 값이 정해지지 않아 선언만 할 경우, 동적할당으로 사이즈만 정해둠
		int[] arr2 = new int[10]; // 10개의 공간을 0으로 채워둠
		int[] arr3 = new int[100]; // 100개의 공간을 0으로 채움
		
		// arr3의 길이를 출력
		System.out.println(arr3.length);
		
		Scanner sc = new Scanner(System.in);
		
		String[] strArr = new String[5]; // null로 5개의 공간을 채워둠
		
		// 배열을 하나씩 하나씩 입력받음
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = sc.nextLine();
		}
		// 배열에 입력 받은 값을 하나씩 출력함
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

}
