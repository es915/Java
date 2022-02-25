public class Member {
	
	private int idx;
	private String loginId;
	private String loginPw;
	private String nickname;
	
	public Member() {}

	public Member(int idx, String loginId, String loginPw, String nickname) {
		super();
		this.idx = idx;
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.nickname = nickname;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPw() {
		return loginPw;
	}

	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}