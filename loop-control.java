public class exam {
	
	public static void main(String[] args) {
		
		// 반복문 제어
		int i;
		for(i=0; i<10; i++) {
			if(i==5) {
				continue; // i가 5일때 해당 반복을 건너 뛰라
				// 5번째 반복 x -> 6번째 반복으로 건너
			}
			if(i==7) {
				break; // i가 7일때 "반복문" 을 종료해라
			}
		}
		
		int j;
		for(i=1; i<10; i++) {
			for(j=1; j<9; j++) {
				System.out.print(i);
				System.out.println(j);
				break; // j는 1만 반복 -> break, continue는 자기와 가장 가까운 반복문에게 적용
			}
		}	
        
	}

}
