package sunshine.model.DTO;

import java.util.Date;

public class MemberDTO {

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

	StartEndPageDTO startEndPageDTO;

	public MemberDTO() {
	}

	
	
	public MemberDTO(String memNo, String memName, String memId, String memPw, String memPwCon, String memPhone,
			String memEmail, String memAddr, Date memRegist, String memResidentNum) {
		super();
		this.memNo = memNo;
		this.memName = memName;
		this.memId = memId;
		this.memPw = memPw;
		this.memPwCon = memPwCon;
		this.memPhone = memPhone;
		this.memEmail = memEmail;
		this.memAddr = memAddr;
		this.memRegist = memRegist;
		this.memResidentNum = memResidentNum;
	}



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

	public StartEndPageDTO getStartEndPageDTO() {
		return startEndPageDTO;
	}

	public void setStartEndPageDTO(StartEndPageDTO startEndPageDTO) {
		this.startEndPageDTO = startEndPageDTO;
	}

}
