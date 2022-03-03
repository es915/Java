public abstract class Member {

	protected int idx;
	protected String loginId;
	protected String loginPw;
	protected String nickname;
	
	public Member() {}

	public Member(int idx, String loginId, String loginPw, String nickname) {
		super();
		this.idx = idx;
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.nickname = nickname;
	}

	public abstract void intro(); 
	
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
