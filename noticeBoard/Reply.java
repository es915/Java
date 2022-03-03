public class Reply {

	private int idx;		// 식별데이터
	private int parentIdx;  // 어떤 게시물의 댓글이냐? 부모글
	private String body;	// 댓글내용
	private String nickname;// 댓글작성자
	private String regDate; // 댓글작성일
	
	public Reply() {}

	public Reply(int idx, int parentIdx, String body, String nickname, String regDate) {
		super();
		this.idx = idx;
		this.parentIdx = parentIdx;
		this.body = body;
		this.nickname = nickname;
		this.regDate = regDate;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getParentIdx() {
		return parentIdx;
	}

	public void setParentIdx(int parentIdx) {
		this.parentIdx = parentIdx;
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

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
}
