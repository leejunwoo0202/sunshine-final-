package sunshine.command;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ContentsCommand {
	String contentsNo;
	String tcherNo;
	String contentsName;
	Integer contentsPrice;
	String divPeople;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date issueDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
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
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
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
