package sunshine.command;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginCommand {
	
	
	@NotEmpty
	@Size(min = 4, max = 127 , message = "아이디를 입력하여 주세요")
	private String loginId;
	@NotEmpty(message = "비밀번호를 입력하여 주세요")
	private String loginPw;
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
	
	
	
	


}
