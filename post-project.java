import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 명령어를 입력해주세요 : (출력) help(입력)
		// add  : 게시물 등록 (출력)
		// list : 게시물 목록 조회 (출력)
		// 명령어를 입력해주세요 : (출력) add(입력)
		// 제목을 입력해주세요 : (출력) 안녕하세요(입력)
		// 내용을 입력해주세요 : (출력) 반갑습니다(입력)
		// 게시물이 저장되었습니다. (출력)
		// 명령어를 입력해주세요 : (출력) list(입력)
		// 번호 : 1(출력)
		// 제목 : 안녕하세요(출력)
		// 내용 : 반갑습니다(출력)
		// ====================================(출력)
		// 명령어를 입력해주세요 : (출력) add(입력)
		// 제목을 입력해주세요 : (출력) 안녕하세요2(입력)
		// 내용을 입력해주세요 : (출력) 반갑습니다2(입력)
		// 게시물이 저장되었습니다. (출력)
		// 명령어를 입력해주세요 : (출력) list(입력)
		// 번호 : 1(출력)
		// 제목 : 안녕하세요(출력)
		// 내용 : 반갑습니다(출력)
		// ====================================(출력)
		// 번호 : 2(출력)
		// 제목 : 안녕하세요2(출력)
		// 내용 : 반갑습니다2(출력)
		// ====================================(출력)
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> bodies = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("명령어를 입력해주세요 : ");
			String command = sc.nextLine();
			
			if(command.equals("help")) {
				System.out.println("add : 게시물 등록");
				System.out.println("list : 게시물 조회");
			} else if(command.equals("add")) {
				System.out.print("제목을 입력해주세요 : ");
				String title = sc.nextLine();
				System.out.print("내용을 입력해주세요 : ");
				String body = sc.nextLine();
				titles.add(title);
				bodies.add(body);
				System.out.println("게시물이 등록되었습니다.");
			} else if(command.equals("list")) {
				for(int i=0; i<titles.size(); i++) {
					System.out.printf("번호 : %d\n", i+1);
					System.out.printf("제목 : %s\n", titles.get(i));
					System.out.printf("내용 : %s\n", bodies.get(i));
					System.out.println("========================");
				}
			} else {
				System.out.println("잘못된 명령어입니다");
			}
		}
		
	}

}
