package sunshine.model.DTO;

import java.sql.Timestamp;

public class EmployeeDTO {
	String emNo;
	String emName;
	String emId;
	String emPw;
	String emResidentNum;
	String emPhone;
	String emEmail;
	String emAddr;
	Timestamp emRegist;
	public String getEmNo() {
		return emNo;
	}
	public void setEmNo(String emNo) {
		this.emNo = emNo;
	}
	public String getEmName() {
		return emName;
	}
	public void setEmName(String emName) {
		this.emName = emName;
	}
	public String getEmId() {
		return emId;
	}
	public void setEmId(String emId) {
		this.emId = emId;
	}
	public String getEmPw() {
		return emPw;
	}
	public void setEmPw(String emPw) {
		this.emPw = emPw;
	}
	public String getEmResidentNum() {
		return emResidentNum;
	}
	public void setEmResidentNum(String emResidentNum) {
		this.emResidentNum = emResidentNum;
	}
	public String getEmPhone() {
		return emPhone;
	}
	public void setEmPhone(String emPhone) {
		this.emPhone = emPhone;
	}
	public String getEmEmail() {
		return emEmail;
	}
	public void setEmEmail(String emEmail) {
		this.emEmail = emEmail;
	}
	public String getEmAddr() {
		return emAddr;
	}
	public void setEmAddr(String emAddr) {
		this.emAddr = emAddr;
	}
	public Timestamp getEmRegist() {
		return emRegist;
	}
	public void setEmRegist(Timestamp emRegist) {
		this.emRegist = emRegist;
	}
	
}