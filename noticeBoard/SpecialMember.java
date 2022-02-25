public class SpecialMember extends Member {
	
	private int point;

	public SpecialMember() {}
	
	public SpecialMember(int idx, String loginId, String loginPw, String nickname, int point) {
		super(idx, loginId, loginPw, nickname);
//		this.idx = idx;
//		this.loginId = loginId;
//		this.loginPw = loginPw;
//		this.nickname = nickname;
		this.point = point;
	}
	
	public void intro() {
		System.out.printf("안녕하세요 우수회원 %s님 사랑합니다. 회원님의 남은 포인트는 현재 %d입니다.\n", nickname, point);
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}