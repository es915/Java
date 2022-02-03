import java.util.Scanner;
import java.util.Random;

class exam {
	
	static int[] lottoNums = new int[7];
	static int[] myChooseNums = new int[6]; // 내가 선택한 번호
	
	// =============================================================================================
	public static void getLottoNums() {

		//int[] lottoNums = new int[7];
		Random random = new Random();

		int count = 0;
		while (true) {
			int no = random.nextInt(44) + 1; // 1 ~ 45
			if (isDuplicateNoInArr(lottoNums, no) == true) {
				continue;
			}

			lottoNums[count] = no;
			count++;

			// 뽑은 번호의 총 갯수가 7이 되면 무한 반복 종료.
			if (count == 7) {
				break;
			}
		}
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

	// ============================================================================================
	public static void getMyNums() {

		Scanner sc = new Scanner(System.in);
		//int[] myChooseNums = new int[6]; // 내가 선택한 번호
		int count2 = 0;

		while (true) {
			System.out.println((count2 + 1) + "번째 번호를 입력해주세요 :");
			int no = Integer.parseInt(sc.nextLine()); // 1 ~ 45

			if (isDuplicateNoInArr(myChooseNums, no) == true) {
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

//		return myChooseNums;
	}

	public static void printNums(int[] targetNums) {
		for (int i = 0; i < targetNums.length; i++) {
			System.out.print(targetNums[i] + " ");
		}
		System.out.println();
	}

	public static int getCountOfMatchNums() {

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
		return matchCount;

	}

	public static void printResult(int matchCount) {
		if (matchCount == 6) {
			System.out.println("1등");
		} else if (matchCount == 5) { // 보너스 번호 일치 여부 O
			System.out.println("2등");
		} else if (matchCount == 4) {
			System.out.println("3등");
		} else if (matchCount == 3) {
			System.out.println("4등");
		} else {
			System.out.println("꽝");
		}
	}
	
	public static void main(String[] args) {

		// 함수 -> 
		
		getLottoNums(); // 당첨 번호 주세요
		getMyNums(); // 내가 선택한 번호 주세요.

		System.out.print("당신이 선택한 번호는 : ");
		printNums(myChooseNums); // 내번호 출력해주세요.

		System.out.print("당첨번호 : "); 
		printNums(lottoNums);// 당첨번호 출력해주세요
		
		int matchCount = getCountOfMatchNums(); // 몇개 맞았는지 알려주세요.
		
		printResult(matchCount); // 결과 보여주세요.
		
	}
}
