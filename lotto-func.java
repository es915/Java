import java.util.Scanner;
import java.util.Random;

// 임포트 => 컨트롤 + 쉬프트(좌) + O
// 자동 코드 정렬 => 컨트롤 + 쉬프트(좌) + F 

class exam {
	// =============================================================================================
	public static int[] getLottoNums() {

		int[] lottoNums = new int[7];
		Random random = new Random();

		int count = 0;
		while (true) {
			int no = random.nextInt(44) + 1; // 1 ~ 45
			if(isDuplicateNoInArr(lottoNums, no) == true) {
				continue;
			}
			
			lottoNums[count] = no;
			count++;
			
			// 뽑은 번호의 총 갯수가 7이 되면 무한 반복 종료.
			if (count == 7) {
				break;
			}
		}

		return lottoNums;
	}

	// =============================================================================================
	public static boolean isDuplicateNoInArr(int[] targetNums, int no) {
		// 내가 현재까지 저장한 번호중에 지금 뽑힌 번호랑 동일한게 있는가?
		// 있으면?? continue;
		for (int j = 0; j < targetNums.length; j++) {
			int myNo = targetNums[j];
			if (no == myNo) {
				no = -1;
				break;
			}
		}

		// 중복된 번호가 있으면
		if (no == -1) {
			System.out.println("번호가 중복됩니다. 다시 입력해주세요.");
			return true;
		}
		
		return false;
	}

	
	//============================================================================================
	public static int[] getMyNums() {
		
		Scanner sc = new Scanner(System.in);
		int[] myChooseNums = new int[6]; // 내가 선택한 번호
		int count2 = 0;
		
		while (true) {
			System.out.println((count2 + 1) + "번째 번호를 입력해주세요 :");
			int no = Integer.parseInt(sc.nextLine()); // 1 ~ 45
			
			if(isDuplicateNoInArr(myChooseNums, no) == true) {
				continue;
			}

			// 뽑은 번호 저장.
			myChooseNums[count2] = no;
			count2++;

			// 뽑은 번호의 총 갯수가 6이 되면 종료.
			if (count2 == 6) {
				break;
			}
		}
		
		return myChooseNums;
	}
	
	public static void main(String[] args) {

		// 아래와 같이 결과가 출력되도록 로또 당첨 번호 7개(보너스 번호 포함)를 선택해주세요.
		// 1. 여기에 당첨 번호 추출 코드 작성해주세요.
		// ======================================================================================
		// v1. for문의 범위를 조절하는 방식으로 구현

		int[] lottoNums = getLottoNums();

		// =============================================================================
		// v2. 무한 반복 구조에서 개수를 모두 채우면 종료하는 방식

		// 로또 번호 뽑기 -> 1 ~ 45
		// 7개 뽑아야 되니까 7번 반복
		// for(int i = 0; i < 8; i++) { // 무한반복

		// ======================================================================================
		// 2.입력을 통해 수동으로 번호 선택하는 코드 작성해주세요. 6개 번호 중복 없이 배열에 저장
		// ======================================================================================
		int[] myChooseNums = getMyNums();
		

		// 입출력예시
		// 1번째 번호를 입력해주세요 : 3
		// 2번째 번호를 입력해주세요 : 12
		// 3번째 번호를 입력해주세요 : 19
		// 4번째 번호를 입력해주세요 : 23
		// 5번째 번호를 입력해주세요 : 36
		// 6번째 번호를 입력해주세요 : 41
		// ======================================================================================
		// 2 출력 코드
		// ======================================================================================
		System.out.print("당신이 선택한 번호는 : ");
		for (int i = 0; i < myChooseNums.length; i++) {
			System.out.print(myChooseNums[i] + " ");
		}
		System.out.println();
		// ======================================================================================
		// 출력결과
		// 당신이 선택한 번호는 : 3 12 19 23 36 41

		// 3. 내가 선택한 번호와 당첨 번호를 대조하여 당첨확인하는 코드를 작성해주세요. (맞은 번호 개수 세기)
		// ======================================================================================
		int matchCount = 0;
		boolean isExistBonus = false;
		for (int i = 0; i < lottoNums.length; i++) {
			int no = lottoNums[i];

			for (int j = 0; j < myChooseNums.length; j++) {
				int myNo = myChooseNums[j];

				if (no == myNo) {
					matchCount++;
					break;
				} else if (myNo == lottoNums[lottoNums.length - 1]) {
					isExistBonus = true;
				}

			}

		}

		System.out.printf("맞은 개수 : %d\n", matchCount);

		// ======================================================================================

		// 1 출력 코드
		// ======================================================================================
		System.out.print("선택된 로또 번호 : ");
		for (int i = 0; i < lottoNums.length - 1; i++) {
			System.out.print(lottoNums[i] + " ");
		}
		System.out.println(", 보너스 번호 : " + lottoNums[lottoNums.length - 1]);
		// ======================================================================================
		// 출력결과
		// 당첨 번호 : 43, 32, 25, 19, 15, 7, 보너스 번호 : 36

		if (matchCount == 6) {
			System.out.println("1등");
		} else if (matchCount == 5) { // 보너스 번호 일치 여부 O
			if (isExistBonus == true) {
				System.out.println("2등");
			} else {
				System.out.println("3등");
			}
		} else if (matchCount == 4) {
			System.out.println("4등");
		} else if (matchCount == 3) {
			System.out.println("5등");
		} else {
			System.out.println("꽝");
		}
	}
}
