import java.util.Scanner;
import java.util.Random;

public class exam {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int[] lottoNums = new int[7]; // 1등 당첨 번호
        int length = lottoNums.length;
        
        int[] myNums = new int[7];
        int myLength = myNums.length;
        
        int i, j;
        
        // 배열크기 만큼 반복
        for(i=0; i<length; i++) {
        	// 난수 뽑기
        	int rd = random.nextInt(44)+1;
        	
        	for(j=0; j<length; j++) {
        		// 지금까지 뽑은 난수중 지금 뽑은 난수와 겹치는지 체크
        		if(lottoNums[j]==rd) {
        			// 중복된 값 발견시 브레이크
        			rd=-1;
        			break;
        		}
        	}
        	
        	// 중복된 값이 발견됬다고 하면
        	if(rd==-1) {
        		i--; // i를 하나 뺴고 컨티뉴
        		continue;
        	} else {
        		lottoNums[i] = rd; // 중복된 값이 없으면 sc를 배열안에 넣음
        	}
        }
        
        // 로또 번호 입력하기
        for(i=0; i<length; i++) {
        	// 로또 번호 입력
        	int sc = scan.nextInt();
        	
        	for(j=0; j<myLength; j++) {
        		// 지금까지 입력한 수 중 현재 입력한 수와 겹치는지 체크
        		if(myNums[j]==sc) {
        			// 중복된 값 발견시 브레이크
        			sc=-1; // sc 를 -1로 설정하고 브레이크
        			break;
        		}
        	}
        	
        	// 중복된 값이 발견됬다고 하면
        	if((sc==-1)||(sc>45)) {
        		i--; // i를 하나 뺴고 컨티뉴
        		System.out.println("중복된 값이 있거나 45를 초과한 값이 있으니 다시 입력해주세요");
        		continue;
        	} else {
        		myNums[i] = sc; // 중복된 값이 없으면 sc를 배열안에 넣음
        	}
        }
        
        for(i=0; i<myLength; i++) {
        	System.out.print(myNums[i] + " ");
        }
        System.out.println();
        
        // 로또 번호 출력하기
        for(i=0; i<length-1; i++) {
        	System.out.print(lottoNums[i] + ", ");
        }
        System.out.println("보너스 번호 : "+lottoNums[length-1]);
        int n=0;
        for(i=0; i<length; i++) {
        	for(j=0; j<myLength; j++) {
        		if(lottoNums[i]==myNums[j]) {
        			n++;
        		}
        	}
        }
        
        // 맞은 로또 등수 출력하기
        switch(n) {
    		case 7:
        		System.out.println("1등");
        		break;
    		case 6:
        		System.out.println("2등");
        		break;
        	case 5:
        		System.out.println("3등");
        		break;
        	case 4:
        		System.out.println("4등");
        		break;
        	default:
        		System.out.println("꽝");
        		break;
        }

    }
}
