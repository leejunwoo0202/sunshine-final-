package model.DTO;

import java.util.Date;

public class MemberDTO {
    
	String userNo;
	String userName;
	String userId;
	String userPw;
	String userPhone;
	String userEmail;
	String userAddr;
	Date  userRegist;
	String userResidentNum;
	
	StartEndPageDTO startEndPageDTO;
	
	public MemberDTO() {}

	public MemberDTO(String userNo, String userName, String userId, String userPw, String userPhone, String userEmail,
			String userAddr, Date userRegist, String userResidentNum) {
		super();
		this.userNo = userNo;
		this.userName = userName;
		this.userId = userId;
		this.userPw = userPw;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userAddr = userAddr;
		this.userRegist = userRegist;
		this.userResidentNum = userResidentNum;
	}

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

	public StartEndPageDTO getStartEndPageDTO() {
		return startEndPageDTO;
	}

	public void setStartEndPageDTO(StartEndPageDTO startEndPageDTO) {
		this.startEndPageDTO = startEndPageDTO;
	}

	
	
	
	
	
	

	
}
