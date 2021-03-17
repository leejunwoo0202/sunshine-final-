package sunshine.command;

import java.util.Date;

public class MemberCommand {
	String userNo;
	String userName;
	String userId;
	String userPw;
	String userPwCon;
	String userPhone;
	String userEmail;
	String userAddr;
	Date userRegist;
	String userResidentNum;

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserPwCon() {
		return userPwCon;
	}

	public void setUserPwCon(String userPwCon) {
		this.userPwCon = userPwCon;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public Date getUserRegist() {
		return userRegist;
	}

	public void setUserRegist(Date userRegist) {
		this.userRegist = userRegist;
	}

	public String getUserResidentNum() {
		return userResidentNum;
	}

	public void setUserResidentNum(String userResidentNum) {
		this.userResidentNum = userResidentNum;
	}

	// 비밀번호와 비밀번호 확인
	public boolean isuserPwEqualsuserPwCon() {
		if (userPw.equals(userPwCon)) {
			return true;
		} else {
			return false;
		}
	}
}
