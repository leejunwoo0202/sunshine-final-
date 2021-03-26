package sunshine.model.DTO;


import java.sql.Timestamp;
import java.util.Date;

public class ContentsDTO {
	String contentsNo;
	String tcherNo;
	String contentsName;
	Integer contentsPrice;
	String divPeople;
	Timestamp issueDate;
	Date validity;
	String grade;
	public String getContentsNo() {
		return contentsNo;
	}
	public void setContentsNo(String contentsNo) {
		this.contentsNo = contentsNo;
	}
	public String getTcherNo() {
		return tcherNo;
	}
	public void setTcherNo(String tcherNo) {
		this.tcherNo = tcherNo;
	}
	public String getContentsName() {
		return contentsName;
	}
	public void setContentsName(String contentsName) {
		this.contentsName = contentsName;
	}
	public Integer getContentsPrice() {
		return contentsPrice;
	}
	public void setContentsPrice(Integer contentsPrice) {
		this.contentsPrice = contentsPrice;
	}
	public String getDivPeople() {
		return divPeople;
	}
	public void setDivPeople(String divPeople) {
		this.divPeople = divPeople;
	}
	public Timestamp getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Timestamp issueDate) {
		this.issueDate = issueDate;
	}
	public Date getValidity() {
		return validity;
	}
	public void setValidity(Date validity) {
		this.validity = validity;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
