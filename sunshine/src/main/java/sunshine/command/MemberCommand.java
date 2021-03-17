package sunshine.command;

import java.util.Date;

public class MemberCommand {
	String memNo;
	String memName;
	String memId;
	String memPw;
	String memPwCon;
	String memPhone;
	String memEmail;
	String memAddr;
	Date memRegist;
	String memResidentNum;

	public String getMemNo() {
		return memNo;
	}

	public void setMemNo(String memNo) {
		this.memNo = memNo;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemPwCon() {
		return memPwCon;
	}

	public void setMemPwCon(String memPwCon) {
		this.memPwCon = memPwCon;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemEmail() {
		return memEmail;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public String getMemAddr() {
		return memAddr;
	}

	public void setMemAddr(String memAddr) {
		this.memAddr = memAddr;
	}

	public Date getMemRegist() {
		return memRegist;
	}

	public void setMemRegist(Date memRegist) {
		this.memRegist = memRegist;
	}

	public String getMemResidentNum() {
		return memResidentNum;
	}

	public void setMemResidentNum(String memResidentNum) {
		this.memResidentNum = memResidentNum;
	}

	// 비밀번호와 비밀번호 확인
	public boolean isuserPwEqualsuserPwCon() {
		if (memPw.equals(memPwCon)) {
			return true;
		} else {
			return false;
		}
	}
}
