import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Board myBoard = new Board();
		myBoard.run();
	}
}

class Board {
	
	ArrayList<Integer> nums = new ArrayList<>();
	ArrayList<String> titles = new ArrayList<>();
	ArrayList<String> bodies = new ArrayList<>();
	ArrayList<Article> articles = new ArrayList<>();
	int lastestArticleNo = 1;
	
	public void printArticles() {
		for(int i = 0; i < titles.size(); i++) {
			System.out.printf("번호 : %d\n", nums.get(i));
			System.out.printf("제목 : %s\n", titles.get(i));
			System.out.println("========================");
		}
	}
	public void run() {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("명령어를 입력해주세요 : ");
			String command = sc.nextLine();

			if (command.equals("help")) {
				System.out.println("add  : 게시물 등록");
				System.out.println("list : 게시물 목록 조회");

			} else if (command.equals("add")) {
				
				System.out.print("제목을 입력해주세요 : ");
				String title = sc.nextLine();
				System.out.print("내용을 입력해주세요 : ");
				String body = sc.nextLine();

				Article article = new Article(lastestArticleNo, title, body);
				articles.add(article);
				
				System.out.println("게시물이 등록되었습니다.");
				lastestArticleNo++;

			} else if (command.equals("list")) {
				printArticles();

			} else if (command.equals("update")) {
				System.out.print("수정할 게시물 번호 :");
				int no = Integer.parseInt(sc.nextLine());

				if (no < 0 || no >= articles.size()) {
					System.out.println("없는 게시물입니다.");

				} else {
					System.out.print("새제목 : ");
					String newTitle = sc.nextLine();
					System.out.print("새내용 : ");
					String newBody = sc.nextLine();					

					System.out.println("수정이 완료되었습니다.");

					printArticles();

				}
			} else if(command.equals("delete")) {
				System.out.print("삭제할 게시물 번호 :");
				int no = Integer.parseInt(sc.nextLine());

				if (no < 0 || no >= titles.size()) {
					System.out.println("없는 게시물입니다.");

				} else {
					nums.remove(no - 1);
					titles.remove(no - 1);
					bodies.remove(no - 1);
					System.out.printf("%d번 게시물이 삭제되었습니다.\n", no);
					printArticles();
				}
			}
		}
	}
}

class Article {
	
	private int idx;
	private String title;
	private String body;
	
	// 기본 생성자
	public Article() {}
	
	// 모든 매개변수 받는 생성자
	public Article(int idx, String title, String body) {
		super();
		this.idx = idx;
		this.title = title;
		this.body = body;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
