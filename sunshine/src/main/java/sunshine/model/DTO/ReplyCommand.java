package sunshine.model.DTO;

import java.util.Date;

public class ReplyCommand {

	String replyNo;
	String boardNo;
	String memNo;
	String replyContent;
	Date replyWriteDate;
	String emId;
	
	public String getReplyNo() {
		return replyNo;
	}
	public void setReplyNo(String replyNo) {
		this.replyNo = replyNo;
	}
	public String getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}
	public String getMemNo() {
		return memNo;
	}
	public void setMemNo(String memNo) {
		this.memNo = memNo;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public Date getReplyWriteDate() {
		return replyWriteDate;
	}
	public void setReplyWriteDate(Date replyWriteDate) {
		this.replyWriteDate = replyWriteDate;
	}
	public String getEmId() {
		return emId;
	}
	public void setEmId(String emId) {
		this.emId = emId;
	}
	
	
	
}
