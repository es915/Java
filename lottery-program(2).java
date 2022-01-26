import java.util.Scanner;
import java.util.Random;

public class exam {

    public static void main(String[] args) {
    
    	Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] lottoNums = new int[7]; // 1등 당첨 번호
        int[] myChooseNums = new int[6]; // 내가 선택한 번호
        int length = lottoNums.length;

        // 아래와 같이 결과가 출력되도록 로또 당첨 번호 7개(보너스 번호 포함)를 선택해주세요.
        // 1. 여기에 당첨 번호 추출 코드 작성해주세요.
        // ======================================================================================
        // v1. for문의 범위를 조절하는 방식으로 구현
        for(int i = 0; i < length; i++) {

            // 당첨번호 저장            
            int num = random.nextInt(44) + 1; // 1 ~ 45 숫자중 랜덤으로 숫자 생성   
            lottoNums[i] = num;
            
            // 중복 체크
            for(int j = 0; j < i; j++) {
                if(num == lottoNums[j]) {
                    i--; // 추가하면 안되므로 이전으로 돌림
                    break;
                }
            }
        }
        // =============================================================================
        // v2. 무한 반복 구조에서 개수를 모두 채우면 종료하는 방식

        // 로또 번호 뽑기 -> 1 ~ 45
        // 7개 뽑아야 되니까 7번 반복 
        //for(int i = 0; i < 8; i++) { // 무한반복
        int count = 0;
        while(true) {	
        	int no = random.nextInt(44) + 1; // 1 ~ 45
        	
        	// 내가 현재까지 저장한 번호중에 지금 뽑힌 번호랑 동일한게 있는가?
        	// 있으면?? continue;
        	for(int j = 0; j < length; j++) {
        		int myNo = lottoNums[j];
        		if(no == myNo) {
        			no = -1;
        			break;
        		}
        	}
        	
        	// 중복된 번호가 있으면
        	if(no == -1) {
        		continue; // 다음 회차로.   		
        	}
        	
        	// 뽑은 번호 저장.
        	lottoNums[count] = no;
        	count++;
        	
        	// 뽑은 번호의 총 갯수가 7이 되면 무한 반복 종료.
        	if(count == 7) {
        		break;
        	}
        }
        // ======================================================================================
        // 2.입력을 통해 수동으로 번호 선택하는 코드 작성해주세요. 6개 번호 중복 없이 배열에 저장
        // ======================================================================================

        int count2 = 0;
        while(true) {	
        	System.out.println((count2 + 1) + "번째 번호를 입력해주세요 :"); 
        	int no = Integer.parseInt(sc.nextLine()); // 1 ~ 45
        	
        	// 내가 현재까지 저장한 번호중에 지금 뽑힌 번호랑 동일한게 있는가?
        	// 있으면?? continue;
        	for(int j = 0; j < myChooseNums.length; j++) {
        		int myNo = myChooseNums[j];
        		if(no == myNo) {
        			no = -1;
        			break;
        		}
        	}
        	
        	// 중복된 번호가 있으면
        	if(no == -1) {
        		System.out.println("번호가 중복됩니다. 다시 입력해주세요.");
        		continue; // 다음 회차로.   		
        	}
        	
        	// 뽑은 번호 저장.
        	myChooseNums[count2] = no;
        	count2++;
        	
        	// 뽑은 번호의 총 갯수가 6이 되면 종료.
        	if(count2 == 6) {
        		break;
        	}
        }
        
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
        for(int i = 0; i < myChooseNums.length; i++) {
            System.out.print(myChooseNums[i] + " ");
        }
        System.out.println();
        // ======================================================================================
        // 출력결과
        // 당신이 선택한 번호는 : 3 12 19 23 36 41

        // 3. 내가 선택한 번호와 당첨 번호를 대조하여 당첨확인하는 코드를 작성해주세요. (맞은 번호 개수 세기)   
        // ======================================================================================
        int cnt=0;
        boolean isExisBonus = false;
        for(int i=0; i<lottoNums.length; i++) {
        	for(int j=0; j<myChooseNums.length; j++) {
        		int my = myChooseNums[j];
        		if(lottoNums[i]==my) {
        			cnt++;
        			break;
        		} else if(my == lottoNums[length-1]) {
        			isExisBonus = true;
        		}
        	}
        }
        
        System.out.println("중복되는 번호는 : " + cnt + "개 입니다");



        // ======================================================================================

        // 1 출력 코드
        // ======================================================================================
        System.out.print("선택된 로또 번호 : ");
        for(int i = 0; i < length - 1; i++) {
            System.out.print(lottoNums[i] + " ");
        }
        System.out.println(", 보너스 번호 : " + lottoNums[length - 1]);
        // ======================================================================================
        // 출력결과
        // 당첨 번호 : 43, 32, 25, 19, 15, 7, 보너스 번호 : 36
        
        if(cnt==6) {
        	System.out.println("1등");
        } else if(cnt==5 && isExisBonus==true) {
        	System.out.println("2등");
        } else if(cnt==5) {
        	System.out.println("3등");
        } else if(cnt==4) {
        	System.out.println("4등");
        } else if(cnt==3) {
        	System.out.println("5등");
        } else {
        	System.out.println("꽝");
        }

    }
}
