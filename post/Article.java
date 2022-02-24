class Article {
	
	private int idx;
	private String title;
	private String body;
	private String nickname;
	private int hit;
	private String regDate;
	// 기본 생성자
	public Article() {}
	
	
	public Article(int idx, String title, String body, String nickname, int hit, String regDate) {
		super();
		this.idx = idx;
		this.title = title;
		this.body = body;
		this.nickname = nickname;
		this.hit = hit;
		this.regDate = regDate;
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


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public int getHit() {
		return hit;
	}


	public void setHit(int hit) {
		this.hit = hit;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

}