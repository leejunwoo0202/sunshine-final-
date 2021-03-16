package model.DTO;

public class StartEndPageDTO {

	Long startPage;
	Long endPage;
	public Long getStartPage() {
		return startPage;
	}
	public void setStartPage(Long startPage) {
		this.startPage = startPage;
	}
	public Long getEndPage() {
		return endPage;
	}
	public void setEndPage(Long endPage) {
		this.endPage = endPage;
	}
	public StartEndPageDTO(Long startPage, Long endPage) {
		super();
		this.startPage = startPage;
		this.endPage = endPage;
	}
	
	
}
