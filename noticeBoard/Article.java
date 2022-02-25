class Article {
	
	private int idx;
	private String title;
	private String body;
	private String regDate;
	private int hit;
	private String nickname;
	
	// 기본 생성자
	public Article() {}
	
	// 모든 매개변수 받는 생성자

	public Article(int idx, String title, String body, String regDate, int hit, String nickname) {
		super();
		this.idx = idx;
		this.title = title;
		this.body = body;
		this.regDate = regDate;
		this.hit = hit;
		this.nickname = nickname;
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

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}