public class GeneralMember extends Member {
	
	public GeneralMember(int idx, String loginId, String loginPw, String nickname) {
		this.idx = idx;
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.nickname = nickname;
	}

	
	public void intro() {
		System.out.printf("안녕하세요 일반회원 %s님 반갑습니다\n", nickname);
	}
	
}