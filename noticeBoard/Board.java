import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Board {
	
	ArrayList<Article> articles = new ArrayList<>();
	ArrayList<Member> members = new ArrayList<>();
	ArrayList<Reply> replies = new ArrayList<>();
	
	int lastestArticleNo = 4;
	int lastestMemberNo = 2;
	int lastestReplyNo = 1;
	Scanner sc = new Scanner(System.in);
	
	boolean isLogined = false; // 회원 로그인 여부
	Member loginedMemberInfo = null; // 로그인 한 회원의 정보
	
	public void run() {
		init();
		
		while (true) {
			
			if(isLogined == true) {
				System.out.printf("명령어를 입력해주세요[%s(%s)]: ", loginedMemberInfo.getLoginId(), loginedMemberInfo.getNickname());	
			} else {
				System.out.println("명령어를 입력해주세요 : ");				
			}
			
			String command = sc.nextLine();

			if (command.equals("help")) {
				printHelp();

			} else if (command.equals("add")) {
				add();

			} else if (command.equals("list")) {
				printArticles(articles);

			} else if (command.equals("update")) {
				update();		

			} else if(command.equals("delete")) {
				delete();
				
			} else if(command.equals("search")) {
				search();
				
			} else if(command.equals("read")) {
				if(isLogined == true) {					
					read();
				} else {
					System.out.println("로그인이 필요한 기능입니다.");
				}
				
			} else if(command.equals("signup")) {
				signup();
				
			} else if(command.equals("signin")) {
				signin();
			}
		}
	}
	

	private void signin() {
		
		System.out.print("아이디 : ");
		String loginId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String loginPw = sc.nextLine();
		
		Member member  = getMemberByLoginInfo(loginId, loginPw);
		
		if(member == null) {
			System.out.println("잘못된 회원정보 입니다.");
		} else {
			member.intro();
			loginedMemberInfo = member;
			isLogined = true;
		}
	}
	
	private Member getMemberByLoginInfo(String loginId, String loginPw) {
		for(int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			
			if(member.getLoginId().equals(loginId)) {
				if(member.getLoginPw().equals(loginPw)) {
					return member;
				}
			}
		}
		
		return null;
	}

	private void signup() {
		  System.out.println("==== 회원 가입을 진행합니다 ====");
		  System.out.println("회원을 구분해주세요 (1. 일반회원, 2. 우수회원): ");
		  int gb = Integer.parseInt(sc.nextLine());
		  
		  System.out.print("아이디를 입력해주세요 : ");
		  String loginId = sc.nextLine();
		  System.out.print("비밀번호를 입력해주세요 : ");
		  String loginPw = sc.nextLine();
		  System.out.print("닉네임을 입력해주세요 : ");
		  String nickname = sc.nextLine();
		  
		  Member member = null;
		  if (gb == 1) {
			  
			  member = new GeneralMember(lastestMemberNo, loginId, loginPw, nickname);

		  } else {
			  member = new SpecialMember(lastestMemberNo, loginId, loginPw, nickname, 0);
		  }
		  members.add(member);
		  lastestMemberNo++;
		  
		  
		  System.out.println("회원가입이 완료되었습니다.");
		  
	}

	private void printArticle(Article article) {
		System.out.printf("===== %d번 게시물 =====\n", article.getIdx());
		System.out.printf("번호 : %d\n", article.getIdx());
		System.out.printf("제목 : %s\n", article.getTitle());
		System.out.printf("작성자 : %s\n", article.getNickname());
		System.out.printf("등록날짜 : %s\n", article.getRegDate());
		System.out.printf("조회수 : %d\n", article.getHit());
		System.out.printf("-----------------\n");
		System.out.printf("내용 : %s\n", article.getBody());
		System.out.printf("-----------------\n");
		System.out.println("====================");
		System.out.println("======= 댓글 ========");
		for(int i = 0; i < replies.size(); i++) {
			if(article.getIdx() == replies.get(i).getParentIdx()) {
				System.out.printf("내용  : %s\n", replies.get(i).getBody());
				System.out.printf("작성자 : %s\n", replies.get(i).getNickname());
				System.out.printf("작성일 : %s\n", replies.get(i).getRegDate());
				System.out.println("====================");
			}
		}
	
	}
	
	private void readProcess(Article article) {
		while(true) {
			System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 좋아요, 3. 수정, 4. 삭제, 5. 목록으로) : ");
			int readCmd = Integer.parseInt(sc.nextLine());
			
			if(readCmd == 1) {

				addReply(article);
				
			} else if(readCmd == 2) {
				System.out.println("좋아요");
			} else if(readCmd == 3) {
				System.out.println("수정");
			} else if(readCmd == 4) {
				System.out.println("삭제");
			} else if(readCmd == 5) {
				System.out.println("목록으로");
				break;
			} 			
		}
		
	}
	
	private void addReply(Article article) {
		System.out.print("댓글 내용을 입력해주세요 :");
		String replyBody = sc.nextLine();
		//2. 작성자
		String nickname = loginedMemberInfo.getNickname();
		//3. 작성일
		String regDate =  getCurrentDate();
		//4. idx
		
		//5. 부모글번호
		int parentIdx = article.getIdx();
		
		Reply reply = new Reply(lastestReplyNo, parentIdx, replyBody, nickname, regDate);
		replies.add(reply);
		System.out.println("댓글이 등록되었습니다.");
		printArticle(article);
		
	}


	private void read() {
		System.out.print("상세보기할 게시물 번호를 입력해주세요 :");
		int idx = Integer.parseInt(sc.nextLine());
		
		Article article = getArticleByIdx(idx);
		
		if(article != null) {
			printArticle(article);
			int currentHit = article.getHit();
			article.setHit(currentHit + 1);			
			readProcess(article);
			
		} else {
			System.out.println("없는 게시물입니다.");
		}
		
	}

	private void search() {
		
		System.out.print("검색 키워드를 입력해주세요 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Article> searchedList = new ArrayList<>();
		
		for(int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
				
			if(article.getTitle().contains(keyword)) {
				searchedList.add(article);
			}
		}
		
		printArticles(searchedList);
		
	}

	private void init() {
		
		Article a1 = new Article(1, "제목1", "내용1", "2022.02.24", 30, "익명");
		Article a2 = new Article(2, "제목2", "내용2", "2022.02.24", 10, "익명");
		Article a3 = new Article(3, "제목2", "내용2", "2022.02.24", 20, "익명");
		
		Member m1 = new GeneralMember(1, "hong123", "h1234", "홍길동");
		
		articles.add(a1);
		articles.add(a2);
		articles.add(a3);
		
		members.add(m1);
		
		loginedMemberInfo = m1;
		isLogined = true;
		
		
	}

	private void printHelp() {
		System.out.println("add  : 게시물 등록");
		System.out.println("list : 게시물 목록 조회");
		System.out.println("update : 게시물 수정");
		System.out.println("delete : 게시물 삭제");
	}

	private void delete() {
		System.out.print("삭제할 게시물 번호 :");
		int idx = Integer.parseInt(sc.nextLine());
		Article article = getArticleByIdx(idx);
		
		if(article != null) {
			//articles.remove(i);// 순번으로지우는 버전
			articles.remove(article);// 값으로지우는 버전
			printArticles(articles);
		} else {
			System.out.println("없는 게시물입니다.");	
		}
	}

	private void update() {
		System.out.print("수정할 게시물 번호 :");
		int idx = Integer.parseInt(sc.nextLine());
		Article article = getArticleByIdx(idx);
		
		if(article != null) {
			System.out.print("새제목 : ");
			String newTitle = sc.nextLine();
			System.out.print("새내용 : ");
			String newBody = sc.nextLine();
			
			article.setTitle(newTitle);
			article.setBody(newBody);
			printArticles(articles);
		} else {
			System.out.println("없는 게시물입니다.");	
		}		
	}

	private void add() {
		System.out.print("제목을 입력해주세요 : ");
		String title = sc.nextLine();
		System.out.print("내용을 입력해주세요 : ");
		String body = sc.nextLine();
		
		Article article = new Article(lastestArticleNo, title, body, getCurrentDate(), 0, "익명");
		articles.add(article);
		
		System.out.println("게시물이 등록되었습니다.");
		lastestArticleNo++;
	}

	public Article getArticleByIdx(int idx) {
		for(int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			if(article.getIdx() == idx) {
				return article;
			}
		}
		
		return null;
	}
	
	public void printArticles(ArrayList<Article> targetList) {
		for(int i = 0; i < targetList.size(); i++) {
		
			Article article = targetList.get(i);
			
			System.out.printf("번호 : %d\n", article.getIdx());
			System.out.printf("제목 : %s\n", article.getTitle());
			System.out.printf("작성자 : %s\n", article.getNickname());
			System.out.printf("등록날짜 : %s\n", article.getRegDate());
			System.out.printf("조회수 : %d\n", article.getHit());
			System.out.println("========================");
		}
	}
	
	private String getCurrentDate() {
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		String formatedNow = now.format(formatter);
		
		return formatedNow;
	}
	
}