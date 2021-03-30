package sunshine.command;

import java.sql.Timestamp;

public class CondoReserCommand {

	String reserNum;
	String memNo;
	Timestamp reserDate;
	String reserName;
	String reserAdult;
	String reserPhone;
	String reserRoom;
	String reserKids;
	Timestamp chkIn;
	Timestamp chkOut;
	String payMet;
	
	public String getPayMet() {
		return payMet;
	}
	public void setPayMet(String payMet) {
		this.payMet = payMet;
	}
	public String getReserNum() {
		return reserNum;
	}
	public void setReserNum(String reserNum) {
		this.reserNum = reserNum;
	}
	public String getMemNo() {
		return memNo;
	}
	public void setMemNo(String memNo) {
		this.memNo = memNo;
	}
	public Timestamp getReserDate() {
		return reserDate;
	}
	public void setReserDate(Timestamp reserDate) {
		this.reserDate = reserDate;
	}
	public String getReserName() {
		return reserName;
	}
	public void setReserName(String reserName) {
		this.reserName = reserName;
	}
	public String getReserAdult() {
		return reserAdult;
	}
	public void setReserAdult(String reserAdult) {
		this.reserAdult = reserAdult;
	}
	public String getReserPhone() {
		return reserPhone;
	}
	public void setReserPhone(String reserPhone) {
		this.reserPhone = reserPhone;
	}
	public String getReserRoom() {
		return reserRoom;
	}
	public void setReserRoom(String reserRoom) {
		this.reserRoom = reserRoom;
	}
	public String getReserKids() {
		return reserKids;
	}
	public void setReserKids(String reserKids) {
		this.reserKids = reserKids;
	}
	public Timestamp getChkIn() {
		return chkIn;
	}
	public void setChkIn(Timestamp chkIn) {
		this.chkIn = chkIn;
	}
	public Timestamp getChkOut() {
		return chkOut;
	}
	public void setChkOut(Timestamp chkOut) {
		this.chkOut = chkOut;
	}
	
}
